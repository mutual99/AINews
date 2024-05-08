import { createRouter, createWebHistory } from "vue-router";
import Header from "@/components/Header.vue";
import Home from "@/pages/Home";
import Login from "@/pages/Login";
import Write from "@/pages/Write.vue";
import Economy from "@/pages/Economy.vue";

const routes = [
  {
    path: "/",
    name: "Home",
    components: { default: Home, header: Header },
  },
  {
    path: "/login",
    name: "Login",
    components: { default: Login },
  },
  {
    path: "/write",
    name: "Write",
    components: { default: Write, header: Header },
  },
  {
    path: "/economy",
    name: "Economy",
    components: { default: Economy, header: Header },
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
