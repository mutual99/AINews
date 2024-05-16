import { createRouter, createWebHistory } from "vue-router";
import Header from "@/components/Header.vue";
import Home from "@/pages/Home";
import Login from "@/pages/Login";
import Deluser from "@/pages/Deluser.vue";
import Upduser from "@/pages/Upduser.vue";
import Write from "@/pages/Write.vue";
import Detail from "@/pages/Detail.vue";
import Economy from "@/pages/Economy.vue";
import Industry from "@/pages/Industry.vue";

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
    path: "/deluser",
    name: "Deluser",
    components: { default: Deluser },
    meta: { requiresAuth: true },
  },
  {
    path: "/upduser",
    name: "Upduser",
    components: { default: Upduser },
    meta: { requiresAuth: true },
  },
  {
    path: "/write",
    name: "Write",
    components: { default: Write, header: Header },
    meta: { requiresAuth: true },
  },
  {
    path: "/detail/:no",
    name: "Detail",
    components: { default: Detail, header: Header },
    meta: { requiresAuth: false },
  },
  {
    path: "/economy",
    name: "Economy",
    components: { default: Economy, header: Header },
    meta: { requiresAuth: false },
  },
  {
    path: "/industry",
    name: "Industry",
    components: { default: Industry, header: Header },
    meta: { requiresAuth: false },
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
