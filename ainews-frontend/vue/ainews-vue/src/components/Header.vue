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
    <a href="/" class="mainpage">
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
            <a class="nav-link" href="economy">경제</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="industry">산업</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="society">사회</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="sport">스포츠</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="enter">연예</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="ITBio">IT</a>
          </li>
        </ul>
        <button
          class="navbar-toggler"
          type="button"
          data-bs-toggle="offcanvas"
          data-bs-target="#offcanvasNavbar"
          aria-controls="offcanvasNavbar"
          aria-label="Toggle navigation"
          @click="getterUser"
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
              <span class="myname">{{ nickname }}</span>
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
              <div v-if="chk">
                <li class="nav-item" v-if="rolechk">
                  <a class="nav-link" href="/write">writeNews</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="/login" @click="localremove"
                    >Logout</a
                  >
                </li>
              </div>
              <div v-if="!chk">
                <li class="nav-item">
                  <a class="nav-link" href="/login">login</a>
                </li>
              </div>
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
                    <a class="dropdown-item" href="economy">경제</a>
                    <hr />
                  </li>
                  <li>
                    <a class="dropdown-item" href="industry">산업</a>
                    <hr />
                  </li>
                  <li>
                    <a class="dropdown-item" href="enter">연예</a>
                    <hr />
                  </li>
                  <li>
                    <a class="dropdown-item" href="sport">스포츠</a>
                    <hr />
                  </li>
                  <li>
                    <a class="dropdown-item" href="society">사회</a>
                    <hr />
                  </li>
                  <li>
                    <a class="dropdown-item" href="ITBio">IT</a>
                  </li>
                </ul>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "GetUser",
  data() {
    return {
      chk: sessionStorage.getItem("role"),
      nickname: sessionStorage.getItem("nickname"),
      rolechk: sessionStorage.getItem("role") === "ROLE_ADMIN",
    };
  },
  methods: {
    localremove() {
      sessionStorage.clear();
    },
  },
};
</script>

<style>
@import "/src/assets/css/reset.css";
@import "/src/assets/css/main.css";
</style>
