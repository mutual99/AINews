import { createRouter, createWebHistory } from "vue-router";
import Header from "@/components/Header.vue";
import Home from "@/pages/Home";
import Login from "@/pages/Login";
import Write from "@/pages/Write.vue";
import Economy from "@/pages/Economy.vue";
import Deluser from "@/pages/Deluser.vue";

const routes = [
  {
    path: "/",
    name: "Home",
    components: { default: Home, header: Header },
    meta: { requiresAuth: false },
  },
  {
    path: "/login",
    name: "Login",
    components: { default: Login },
    meta: { requiresAuth: false },
  },
  {
    path: "/write",
    name: "Write",
    components: { default: Write, header: Header },
    meta: { requiresAuth: true },
  },
  {
    path: "/economy",
    name: "Economy",
    components: { default: Economy, header: Header },
    meta: { requiresAuth: false },
  },
  {
    path: "/deluser",
    name: "Deluser",
    components: { default: Deluser },
    meta: { requiresAuth: false },
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
