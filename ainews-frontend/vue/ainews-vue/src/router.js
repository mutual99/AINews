import { createRouter, createWebHistory } from "vue-router";
import Home from "@/pages/Home.vue";

const routes = [
  {
    path: "/",
    name: "Home",
    components: { defaultL: Home, header: Header },
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
