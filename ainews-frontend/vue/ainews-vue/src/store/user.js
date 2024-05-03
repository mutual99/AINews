import { adduser } from "@/api/user";

export default {
  state: {
    users: [],
  },
  mutations: {
    setUser(state, users) {
      state.users = users;
    },
  },
  actions: {
    async insertUser({ commit }, data) {
      const response = await adduser(data);
      commit("adduser", response.data);
    },
  },
};
