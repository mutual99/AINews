import { addboard, getboards } from "@/api/board";

export default {
  state: {
    board: {},
    boards: [],
  },
  mutations: {
    setBoard(state, board) {
      state.board = board;
    },
    getBoards(state, boards) {
      state.boards = boards;
    },
  },
  actions: {
    async sendWrite({ commit }, data) {
      await addboard(data);
      commit("setBoard", data);
    },
    async viewBoards({ commit }, data) {
      await getboards(data);
      commit("getBoards", data);
    },
  },
  getters: {},
};
