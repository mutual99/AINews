<template>
  <div class="bodynews">
    <p>경제</p>
    <div class="boardDate">
      <!-- 현재 날짜 스크립트 -->
    </div>
    <table>
      <tbody>
        <tr class="table" v-for="board in allBoards" :key="board.no">
          <td class="news" v-if="board.category === 'industry'">
            {{ board.title }}
          </td>
          <td class="newsnickname" v-if="board.category === 'industry'">
            {{ board.nickname }}
          </td>
          <td class="newscontent" v-if="board.category === 'industry'">
            {{ board.content }}
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
    titlechk() {
      this.$store.dispatch("viewBoards");
    },
  },
  computed: {
    // 최종적으로 계산된 데이터
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
