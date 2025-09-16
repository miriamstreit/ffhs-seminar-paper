<script setup>
import { watch, ref } from "vue";
import { useRoute } from "vue-router";

const route = useRoute();
const name = route.params.name ? ref(route.params.name) : ref("stranger");

watch(
  () => route.params.name,
  (newUser) => {
    name.value = newUser;
  }
);
</script>

<template>
  <main>
    <p>Hello, {{ name }}!</p>
  </main>
</template>
