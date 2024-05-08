<template>
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

<script>
export default {
  name: "Homescript",
  data() {
    return {};
  },
  methods: {},
};
</script>

<style>
@import "/src/assets/css/reset.css";
@import "/src/assets/css/main.css";
</style>
