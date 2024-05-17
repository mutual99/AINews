<template>
  <div class="writing">
    <select name="category" v-model="board.category">
      <option value="" required="required" selected disabled hidden>
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
    <input type="hidden" v-model="board.date" />
    <div>
      <input type="submit" class="button" value="submit" @click="sendWrite" />
    </div>
  </div>
</template>

<script>
import { secureStorage } from "@/store/user";

export default {
  name: "CreateWrite",
  data() {
    return {
      board: {
        category: "",
        title: "",
        content: "",
        nickname: "",
        date: new Date(),
      },
    };
  },
  async mounted() {
    await this.sercretNick();
  },
  methods: {
    async sendWrite() {
      if (
        !this.board.category ||
        !this.board.title ||
        !this.board.content ||
        !this.board.nickname
      ) {
        alert("모든 필드를 채워주세요.");
        return;
      }
      try {
        await this.$store.dispatch("sendWrite", this.board);
        console.log(this.board);
        this.board = {
          category: "",
          title: "",
          content: "",
          nickname: "",
          date: new Date(),
        };
        this.$router.push("/");
      } catch (error) {
        console.error("글 작성 중 오류 발생:", error);
        alert("글 작성 중 오류가 발생했습니다.");
      }
    },
    async sercretNick() {
      try {
        const result = await secureStorage.getItem("user");
        if (result && result.nickname) {
          console.log(result.nickname);
          this.board.nickname = result.nickname;
        } else {
          alert("로그인 정보가 없습니다. 다시 로그인 해주세요.");
          this.$router.push("/login");
        }
      } catch (error) {
        console.error("닉네임 가져오기 중 오류 발생:", error);
        alert("닉네임 가져오는 중 오류가 발생했습니다.");
      }
    },
  },
};
</script>

<style>
@import "/src/assets/css/reset.css";
@import "/src/assets/css/write.css";
</style>
