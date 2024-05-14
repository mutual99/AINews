import { adduser, userlogin, getuser, deluser } from "@/api/user";

export default {
  state: {
    user: {},
  },
  mutations: {
    setUser(state, user) {
      state.user = user;
    },
    getUser(state, user) {
      state.user = user;
    },
    delUser(state, user) {
      state.user = user;
    },
  },
  actions: {
    async insertUser({ commit }, data) {
      console.log(data);
      await adduser(data);
      commit("setUser", data);
    },
    async login({ commit }, data) {
      const result = await userlogin(data);
      commit("setUser", result.data);
      sessionStorage.setItem("id", result.data.id);
      sessionStorage.setItem("password", result.data.password);
      sessionStorage.setItem("name", result.data.name);
      sessionStorage.setItem("nickname", result.data.nickname);
      sessionStorage.setItem("role", result.data.role);
      console.log(result.data.role);
    },
    async getterUser({ commit }, id) {
      const result = await getuser(id);
      console.log(result);
      commit("getUser", result.id);
    },
    async deleteUser({ commit }, data) {
      const delresult = await deluser(data);
      commit("delUser", delresult.data);
    },
  },
};
