<template>
  <!-- ============= -->
  <div class="logocon">
    <a href="main.html" class="mainpage">
      <div id="logocontainer">
        <span class="logotext1">Read</span>
        <div id="flip">
          <div>
            <div>economy, industry</div>
          </div>
          <div>
            <div>entertainments, sports</div>
          </div>
          <div>
            <div>society, IT</div>
          </div>
        </div>
        <span class="logotext2">News!</span>
      </div>
    </a>
  </div>
  <!-- Top bar-->
  <div class="topbar">
    <div class="navbar bg-body-tertiary">
      <div class="container-fluid">
        <a class="navbar-brand" href="/"> </a>
        <ul class="nav justify-content-center">
          <li class="nav-item">
            <a class="nav-link" href="economyboard.html">경제</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="industryboard.html">산업</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="societyboard.html">사회</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="sportboard.html">스포츠</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="enterboard.html">연예</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="ITBioboard.html">IT</a>
          </li>
        </ul>
        <button
          class="navbar-toggler"
          type="button"
          data-bs-toggle="offcanvas"
          data-bs-target="#offcanvasNavbar"
          aria-controls="offcanvasNavbar"
          aria-label="Toggle navigation"
        >
          <span class="navbar-toggler-icon"></span>
        </button>
        <div
          class="offcanvas offcanvas-end"
          tabindex="-1"
          id="offcanvasNavbar"
          aria-labelledby="offcanvasNavbarLabel"
        >
          <div class="offcanvas-header">
            <h5 class="offcanvas-title" id="offcanvasNavbarLabel">
              <span class="myname">펭귄</span>
            </h5>
            <button
              type="button"
              class="btn-close"
              data-bs-dismiss="offcanvas"
              aria-label="Close"
            ></button>
          </div>
          <nav class="navbar">
            <div class="container-fluid">
              <form class="d-flex" role="search">
                <input
                  class="form-control me-2"
                  type="search"
                  placeholder="Search"
                  aria-label="Search"
                />
                <button type="button" class="btn btn-info">Search</button>
              </form>
            </div>
          </nav>
          <div class="offcanvas-body">
            <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="login.html">MyPage</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="login.html">Logout</a>
              </li>

              <li class="nav-item dropdown">
                <a
                  class="nav-link dropdown-toggle"
                  href="#"
                  role="button"
                  data-bs-toggle="dropdown"
                  aria-expanded="false"
                >
                  News
                </a>
                <ul class="dropdown-menu">
                  <li>
                    <a class="dropdown-item" href="economyboard.html">경제</a>
                    <hr />
                  </li>
                  <li>
                    <a class="dropdown-item" href="industryboard.html">산업</a>
                    <hr />
                  </li>
                  <li>
                    <a class="dropdown-item" href="societyboard.html">사회</a>
                    <hr />
                  </li>
                  <li>
                    <a class="dropdown-item" href="sportboard.html">스포츠</a>
                    <hr />
                  </li>
                  <li>
                    <a class="dropdown-item" href="enterboard.html">연예</a>
                    <hr />
                  </li>
                  <li>
                    <a class="dropdown-item" href="ITBioboard.html">IT</a>
                  </li>
                </ul>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="bodynews">
    <h1>경제</h1>
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
};
</script>

<style>
@import "/src/assets/css/board.css";
</style>
