<template>
  <div>
    <h4>상세페이지</h4>
    <h4>{{ $route.params.no }}</h4>
    <p v-if="board">{{ board.title }}</p>
    <p v-if="board">{{ board.content }}</p>
    <p v-if="board">{{ formatDate(board.date) }}</p>
    <p v-else>Loading...</p>
  </div>
</template>

<script>
export default {
  name: "Detailpage",
  computed: {
    board() {
      return this.$store.getters.currentBoard;
    },
  },
  async created() {
    await this.fetchBoard();
  },
  methods: {
    async fetchBoard() {
      const boardNo = this.$route.params.no;
      await this.$store.dispatch("viewBoard", boardNo);
    },
    formatDate(date) {
      // 날짜를 원하는 형식으로 포맷팅합니다.
      return new Date(date).toLocaleDateString();
    },
  },
};
</script>

<style scoped>
@import "/src/assets/css/reset.css";
@import "/src/assets/css/main.css";
</style>
