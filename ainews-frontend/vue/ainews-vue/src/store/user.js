import { adduser, userlogin, deluser, upduser } from "@/api/user";
import CryptoJS from "crypto-js";

const SECRET_KEY = process.env.SECRET_KEY || "default secret key";

class SecureStorage {
  constructor(storage, options) {
    this.storage = storage;
    this.hash = options.hash;
    this.encrypt = options.encrypt;
    this.decrypt = options.decrypt;
  }

  setItem(key, value) {
    const hashedKey = this.hash(key);
    const encryptedData = this.encrypt(JSON.stringify(value));
    this.storage.setItem(hashedKey, encryptedData);
  }

  getItem(key) {
    const hashedKey = this.hash(key);
    const encryptedData = this.storage.getItem(hashedKey);
    if (!encryptedData) return null;
    const decryptedData = this.decrypt(encryptedData);
    return JSON.parse(decryptedData);
  }

  removeItem(key) {
    const hashedKey = this.hash(key);
    this.storage.removeItem(hashedKey);
  }

  clear() {
    this.storage.clear();
  }

  key(id) {
    return this.storage.key(id);
  }

  get length() {
    return this.storage.length;
  }
}

export const secureStorage = new SecureStorage(sessionStorage, {
  hash(key) {
    const hashedKey = CryptoJS.SHA256(key, SECRET_KEY);
    return hashedKey.toString();
  },
  // 암호화
  encrypt(data) {
    const encryptedData = CryptoJS.AES.encrypt(data, SECRET_KEY).toString();
    return encryptedData;
  },
  // 복호화
  decrypt(data) {
    const bytes = CryptoJS.AES.decrypt(data, SECRET_KEY);
    const decryptedData = bytes.toString(CryptoJS.enc.Utf8);
    return decryptedData;
  },
});

export default {
  state: {
    user: {},
  },
  mutations: {
    setUser(state, user) {
      state.user = user;
    },
    delUser(state) {
      state.user = {};
    },
  },
  actions: {
    // 회원가입
    async insertUser({ commit }, data) {
      console.log(data);
      await adduser(data);
      commit("setUser", data);
    },
    // 로그인
    async login({ commit }, data) {
      const result = await userlogin(data);
      commit("setUser", result.data);
      secureStorage.setItem("user", {
        nickname: result.data.nickname,
        role: result.data.role,
        id: result.data.id,
        password: result.data.password,
        name: result.data.name,
      });
    },
    // 회원탈퇴
    async deleteUser({ commit }, id) {
      await deluser(id);
      commit("delUser");
      secureStorage.removeItem("user");
    },
    // 회원정보수정
    async updateUser({ commit }, data) {
      const result = await upduser(data);
      console.log(data);
      commit("setUser", data);
      secureStorage.setItem("user", {
        nickname: result.data.nickname,
        role: result.data.role,
        id: result.data.id,
        password: result.data.password,
        name: result.data.name,
      });
    },
  },
};
