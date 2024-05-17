<template>
  <div class="bodynews">
    <p>경제</p>
    <div class="boardDate">
      {{ currentDate }}
    </div>
    <table>
      <tbody>
        <tr
          class="table"
          v-for="board in allBoards"
          :key="board.no"
          @click="detailpage(board.no)"
        >
          <td class="news" v-if="board.category === 'economy'">
            {{ board.no }}
          </td>
          <td class="news" v-if="board.category === 'economy'">
            {{ board.title }}
          </td>
          <td class="newsnickname" v-if="board.category === 'economy'">
            {{ board.nickname }}
          </td>
          <td class="newscontent" v-if="board.category === 'economy'">
            {{ board.content }}
          </td>
          <td class="newscontent" v-if="board.category === 'economy'">
            {{ formatDate(board.date) }}
          </td>
        </tr>
      </tbody>
    </table>
  </div>

  <!-- Top 버튼 -->
  <footer>
    <div class="item14-footer">-㈜나몰라라컴퍼니-</div>
  </footer>
  <div class="dropup">
    <a href=""><i class="fa-solid fa-chevron-up fa-2xl"></i></a>
  </div>
</template>

<script>
export default {
  name: "EconomyBoard",
  data() {
    return {
      boardcategory: "economy",
      currentDate: new Date().toLocaleDateString(), // 현재 날짜를 추가합니다.
    };
  },
  mounted() {
    this.boardchk();
  },
  methods: {
    async boardchk() {
      await this.$store.dispatch("viewBoards");
      console.log(this.$store.state.board.boards);
    },
    detailpage(boardNo) {
      this.$store.dispatch("viewBoard", boardNo);
      this.$router.push("/detail/" + boardNo);
    },
    formatDate(date) {
      // 날짜를 원하는 형식으로 포맷팅합니다.
      return new Date(date).toLocaleDateString();
    },
  },
  computed: {
    // 최종적으로 계산된 데이터(?)
    allBoards() {
      return this.$store.state.board.boards;
    },
  },
};
</script>

<style scoped>
@import "/src/assets/css/reset.css";
@import "/src/assets/css/board.css";
@import "/src/assets/css/main.css";
</style>
