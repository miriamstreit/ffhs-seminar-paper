import { mount } from "@vue/test-utils";
import { test, expect, beforeEach } from "vitest";
import { createRouter, createWebHistory } from "vue-router";
import { routes } from "../router/index";
import App from "../App.vue";

let router;
beforeEach(async () => {
  router = createRouter({
    history: createWebHistory(),
    routes: routes,
  });
});

test("anonymous user", async () => {
  router.push("/hello");
  await router.isReady();

  const wrapper = mount(App, {
    global: {
      plugins: [router],
    },
  });
  expect(wrapper.html()).toContain("Hello, stranger!");
});

test("named user", async () => {
  router.push("/hello/world");
  await router.isReady();

  const wrapper = mount(App, {
    global: {
      plugins: [router],
    },
  });
  expect(wrapper.html()).toContain("Hello, world!");
});
