<script>
import TheWelcome from "@/components/TheWelcome.vue";
export default {
  components: {
    TheWelcome,
  },
  data() {
    return {
      message: "Welcome TO VUEJS3",
    };
  },
};
</script>

<template>
  <main>
    <TheWelcome />
  </main>
</template>
