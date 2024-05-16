import { adduser, userlogin, deluser, upduser } from "@/api/user";

export default {
  state: {
    user: {},
  },
  mutations: {
    setUser(state, user) {
      state.user = user;
    },
    delUser(state, user) {
      state.user = user;
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
      sessionStorage.setItem("nickname", result.data.nickname);
      sessionStorage.setItem("role", result.data.role);
      sessionStorage.setItem("id", result.data.id);
    },
    // 회원탈퇴
    async deleteUser({ commit }, id) {
      const result = await deluser(id);
      commit("delUser", result.id);
    },
    // 회원정보수정
    async updateUser({ commit }, data) {
      await upduser(data);
      console.log(data);
      commit("setUser", data);
    },
  },
};
