<template>
  <div class="bodynews">
    <p>경제</p>
    <div class="boardDate">
      <!-- 현재 날짜 스크립트 -->
      {{ nowdate }}
    </div>
    <div class="boardgrid">
      <div class="flexcontainer">
        <div class="flexitem">
          <div class="news">{{ board.title }}</div>
          <div class="newsDate">{{ board.date }}</div>
        </div>
      </div>
      <div class="newstext">
        {{ board.content }}
      </div>

      <!-- 페이지 -->
      <nav aria-label="Page navigation example">
        <ul class="pagination">
          <li class="page-item">
            <a class="page-link" href="#" aria-label="Previous">
              <span aria-hidden="true">&laquo;</span>
            </a>
          </li>
          <li class="page-item"><a class="page-link" href="#">1</a></li>
          <li class="page-item"><a class="page-link" href="#">2</a></li>
          <li class="page-item"><a class="page-link" href="#">3</a></li>
          <li class="page-item">
            <a class="page-link" href="#" aria-label="Next">
              <span aria-hidden="true">&raquo;</span>
            </a>
          </li>
        </ul>
      </nav>
    </div>
  </div>
  <!-- Top 버튼 -->
  <input type="submit" class="button" value="Sign Up" @click="boardchk" />
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
      board: {
        category: "",
        title: "",
        date: "",
        content: "",
      },
    };
  },
  methods: {
    async boardchk() {
      await this.$store.dispatch("viewBoards", this.board);
      console.log(this.board.title);
    },
  },
};
</script>

<style>
@import "/src/assets/css/reset.css";
@import "/src/assets/css/board.css";
</style>
