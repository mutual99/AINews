import { createRouter, createWebHistory } from "vue-router";
import Home from "@/pages/Home.vue";
import Login from "@/pages/Login.vue";
import Header from "@/components/Header.vue";

const routes = [
  {
    path: "/",
    name: "Home",
    components: { default: Home, header: Header },
  },
  {
    path: "/login",
    name: "Login",
    components: { default: Login, header: Header },
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
