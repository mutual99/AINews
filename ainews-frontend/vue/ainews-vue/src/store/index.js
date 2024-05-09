import { createStore } from "vuex";
import user from "@/store/user";
import board from "@/store/board";

export default createStore({
  modules: {
    user,
    board,
  },
});
