import { addboard, getboards, getboard } from "@/api/board";

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
    getBoard(state, board) {
      state.board = board;
    },
  },
  actions: {
    async sendWrite({ commit }, data) {
      await addboard(data);
      commit("setBoard", data);
    },
    async viewBoards({ commit }) {
      const response = await getboards(); // api
      commit("getBoards", response.data);
    },
    async viewBoard({ commit }, no) {
      await getboard();
      commit("getBoard", no);
    },
  },
  getters: {},
};
