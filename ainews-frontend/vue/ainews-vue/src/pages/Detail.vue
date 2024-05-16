<template>
  <div>
    <h4>{{ board[$router.param.no].title }}</h4>
  </div>
</template>

<script>
export default {
  data() {
    return {
      param: {
        no: "",
      },
    };
  },
  methods: {
    async getBoard() {
      await this.$store.dispatch("viewBoard", this.param);
    },
  },
};
</script>

<style></style>
