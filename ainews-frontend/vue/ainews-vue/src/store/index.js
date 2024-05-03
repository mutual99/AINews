import { createStore } from "vuex";
import user from "@/store/user";

export default createStore({
  module: {
    user: user,
  },
});
