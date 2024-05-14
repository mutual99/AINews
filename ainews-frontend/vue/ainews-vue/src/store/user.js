import { adduser, userlogin, deluser } from "@/api/user";

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
    async insertUser({ commit }, data) {
      console.log(data);
      await adduser(data);
      commit("setUser", data);
    },
    async login({ commit }, data) {
      const result = await userlogin(data);
      commit("setUser", result.data);
      const nickname = sessionStorage.setItem("nickname", result.data.nickname);
      sessionStorage.setItem("role", result.data.role);
      console.log(result.data.role);
      Object.freeze(nickname);
    },
    async deleteUser({ commit }, id) {
      const result = await deluser(id);
      commit("delUser", result.id);
    },
  },
};
