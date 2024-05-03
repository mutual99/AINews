import { adduser, userlogin, getuser } from "@/api/user";

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
      localStorage.setItem("user", result.data.role);
    },
    async getterUser({ commit }, id) {
      const result = await getuser(id);
      commit("getUser", result.id);
    },
  },
};
