import { getboards } from "@/api/board";

export default {
  state: {
    boards: [],
  },
  mutations: {
    getboards(state, boards) {
      state.boards = boards;
    },
  },
  actions: {
    async readBoard({ commit }) {
      await getboards();
      console.log(this.getboards);
      commit("getboards");
    },
  },
};
