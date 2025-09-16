import { createRouter, createWebHistory } from "vue-router";
import HelloView from "../views/HelloView.vue";

export const routes = [
  {
    path: "/hello/:name?",
    name: "home",
    component: HelloView,
  },
];

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: routes,
});

export default router;
