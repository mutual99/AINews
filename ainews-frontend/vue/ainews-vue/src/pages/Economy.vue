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
          <div class="news">title1</div>
          <div class="newsDate">date</div>
        </div>
      </div>
      <div class="newstext">
        Lorem ipsum dolor sit amet consectetur adipisicing elit. Nam, earum
        cumque iste tempora laudantium accusamus sint quo maxime et velit, sed
        sapiente est odio dignissimos voluptatem provident error rem id.
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
    return {};
  },
  methods: {},
};
</script>

<style>
@import "/src/assets/css/reset.css";
@import "/src/assets/css/board.css";
</style>
