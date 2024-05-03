<template>
  <div id="loading-screen">
    <p>
      <span id="anim"></span>
      <span id="shuffle"></span>
      <br />
      <br />
    </p>
  </div>

  <!-- 로고 -->
  <div class="logocon">
    <a href="" class="mainpage">
      <div id="logocontainer">
        <span class="logotext1">Read</span>
        <div id="flip">
          <div>
            <div>economy & industry</div>
          </div>
          <div>
            <div>society & sports</div>
          </div>
          <div>
            <div>entertainments & IT</div>
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
                <button type="button" class="btn">Search</button>
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
                <a class="nav-link" href="/login">Logout</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="/login">login</a>
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
                    <a class="dropdown-item" href="enterboard.html">연예</a>
                    <hr />
                  </li>
                  <li>
                    <a class="dropdown-item" href="sportboard.html">스포츠</a>
                    <hr />
                  </li>
                  <li>
                    <a class="dropdown-item" href="societyboard.html">사회</a>
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

  <!-- slider -->
  <div id="slidermain">
    <div class="image-box">
      <div>
        <span class="slidetext">경제</span>
      </div>
      <div>
        <span class="slidetext">산업</span>
      </div>
      <div>
        <span class="slidetext">사회</span>
      </div>
      <div>
        <span class="slidetext">스포츠</span>
      </div>
      <div>
        <span class="slidetext">연예</span>
      </div>
      <div>
        <span class="slidetext">IT</span>
      </div>
      <!-- clone -->
      <div>
        <span class="slidetext">경제</span>
      </div>
      <div>
        <span class="slidetext">산업</span>
      </div>
      <div>
        <span class="slidetext">사회</span>
      </div>
      <div>
        <span class="slidetext">스포츠</span>
      </div>
      <div>
        <span class="slidetext">연예</span>
      </div>
      <div>
        <span class="slidetext">IT</span>
      </div>
    </div>
  </div>
  <!-- news 1 -->
  <div class="newscontainer">
    <div class="news-item">
      <div class="news-t">
        <span class="news-t-span">경제</span>
        <div class="news-tt">
          1-1
          <div class="news-tt-text">
            Lorem ipsum dolor sit amet consectetur, adipisicing elit. Velit,
            iste officia nobis iusto id omnis sapiente aliquid voluptate fugiat
            odit soluta excepturi dolorum veniam adipisci qui molestias quos
            possimus distinctio!
          </div>
        </div>
      </div>
      <div class="news-t">
        <span class="news-t-span">산업</span>
        <div class="news-tt">
          2-1
          <div class="news-tt-text">
            Lorem ipsum dolor sit amet consectetur, adipisicing elit. Velit,
            iste officia nobis iusto id omnis sapiente aliquid voluptate fugiat
            odit soluta excepturi dolorum veniam adipisci qui molestias quos
            possimus distinctio!
          </div>
        </div>
      </div>
      <div class="news-t">
        <span class="news-t-span">사회</span>
        <div class="news-tt">
          3-1
          <div class="news-tt-text">
            Lorem ipsum dolor sit amet consectetur, adipisicing elit. Velit,
            iste officia nobis iusto id omnis sapiente aliquid voluptate fugiat
            odit soluta excepturi dolorum veniam adipisci qui molestias quos
            possimus distinctio!
          </div>
        </div>
      </div>
    </div>
    <div class="news-item">
      <div class="news-t">
        <span class="news-t-span">스포츠</span>
        <div class="news-tt">
          4-1
          <div class="news-tt-text">
            Lorem ipsum dolor sit amet consectetur, adipisicing elit. Velit,
            iste officia nobis iusto id omnis sapiente aliquid voluptate fugiat
            odit soluta excepturi dolorum veniam adipisci qui molestias quos
            possimus distinctio!
          </div>
        </div>
      </div>
      <div class="news-t">
        <span class="news-t-span">연예</span>
        <div class="news-tt">
          5-1
          <div class="news-tt-text">
            Lorem ipsum dolor sit amet consectetur, adipisicing elit. Velit,
            iste officia nobis iusto id omnis sapiente aliquid voluptate fugiat
            odit soluta excepturi dolorum veniam adipisci qui molestias quos
            possimus distinctio!
          </div>
        </div>
      </div>
      <div class="news-t">
        <span class="news-t-span">IT</span>
        <div class="news-tt">
          6-1
          <div class="news-tt-text">
            Lorem ipsum dolor sit amet consectetur, adipisicing elit. Velit,
            iste officia nobis iusto id omnis sapiente aliquid voluptate fugiat
            odit soluta excepturi dolorum veniam adipisci qui molestias quos
            possimus distinctio!
          </div>
        </div>
      </div>
    </div>
  </div>

  <!-- news 2 -->
  <div class="slideshow-container">
    <div class="newsboard">경제</div>
    <!-- 각각의 이미지 -->
    <div class="mySlides">
      <img
        src="/src/assets/image/economy.jpg"
        style="width: 100%; opacity: 0.5; z-index: -1"
      />
      <span class="image-text"
        >Lorem ipsum dolor sit amet consectetur adipisicing elit. Ratione veniam
        iusto cum expedita esse qui totam eos quas nam, praesentium officiis
        atque dolorem architecto nisi natus, inventore numquam tenetur
        doloribus.</span
      >
    </div>
    <div class="mySlides">
      <img
        src="/src/assets/image/economy.jpg"
        style="width: 100%; opacity: 0.5"
      /><span class="image-text"
        >Lorem ipsum dolor sit amet consectetur, adipisicing elit. Repudiandae
        quasi cupiditate dolorum id, sunt error doloremque at ipsum incidunt,
        eos eum laborum voluptates quas culpa quam enim, reprehenderit labore
        perferendis.</span
      >
    </div>

    <div class="mySlides">
      <img
        src="/src/assets/image/economy.jpg"
        style="width: 100%; opacity: 0.5"
      /><span class="image-text"
        >Lorem ipsum dolor sit, amet consectetur adipisicing elit. Ipsa
        assumenda asperiores debitis quidem quas aspernatur adipisci vitae alias
        commodi nesciunt corrupti omnis quibusdam, neque vel. Magnam eveniet
        omnis quam eaque.</span
      >
    </div>

    <!-- 이전/다음 버튼 -->
    <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
    <a class="next" onclick="plusSlides(1)">&#10095;</a>
  </div>

  <!-- =========== -->
  <!-- footer -->
  <footer>
    <div class="footer">-㈜나몰라라컴퍼니-</div>
    <label>
      <!-- 현재 날짜 -->
    </label>
  </footer>
  <!-- =========== -->
  <!-- Top 버튼 -->
  <div class="dropup">
    <a href=""><i class="fa-solid fa-chevron-up fa-2xl"></i></a>
  </div>
</template>

<script></script>

<style>
@import "/src/assets/css/reset.css";
@import "/src/assets/css/main.css";
</style>
