<template>
  <p>dksdsdfds</p>
  <div class="writing">
    <select name="category" required v-model="board.category">
      <option value="" selected disabled hidden>
        카테고리를 선택해주세요.
      </option>
      <option value="economy">경제</option>
      <option value="industry">산업</option>
      <option value="society">사회</option>
      <option value="sport">스포츠</option>
      <option value="enter">연예</option>
      <option value="itbio">IT</option>
    </select>
    <input type="text" placeholder="타이틀 입력" v-model="board.title" />
    <input type="text" placeholder="기사 내용 입력" v-model="board.content" />
    <input type="hidden" v-model="board.nickname" />
    <div>
      <input type="submit" class="button" value="submit" @click="sendWrite" />
    </div>
  </div>
</template>

<script>
export default {
  name: "CreateWrite",
  data() {
    return {
      board: {
        category: "",
        title: "",
        content: "",
        nickname: localStorage.getItem("nickname"),
      },
    };
  },
  methods: {
    async sendWrite() {
      await this.$store.dispatch("sendWrite", this.board);
      console.log(this.board);
      this.board = { category: "", title: "", content: "" };
      this.$router.push("/");
    },
  },
};
</script>

<style>
@import "/src/assets/css/reset.css";
@import "/src/assets/css/write.css";
</style>
