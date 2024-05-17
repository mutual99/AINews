<template>
  <div>
    <input type="text" placeholder="아이디 입력" v-model="user.id" />
    <input
      type="password"
      placeholder="비밀번호 입력"
      v-model="user.password"
    />
    <input type="button" value="회원 탈퇴" @click="deluserdata" />
    <input type="button" value="취소" @click="canceldata" />
  </div>
</template>

<script>
import { secureStorage } from "@/store/user";

export default {
  name: "Deleteuser",
  data() {
    return {
      user: {
        id: "",
        password: "",
      },
    };
  },
  methods: {
    async deluserdata() {
      const result = secureStorage.getItem("user");
      console.log("아이디 " + result.id);
      console.log("패스워드 " + result.password);
      if (this.user.id === "" || this.user.password === "") {
        alert("아이디 또는 비밀번호를 입력하세요.");
        return;
      } else if (
        result.id != this.user.id ||
        result.password != this.user.password
      ) {
        alert("아이디 또는 비밀번호를 다시 확인해 주세요.");
        return;
      }
      try {
        await this.$store.dispatch("deleteUser", this.user.id);
        alert("회원 탈퇴가 완료되었습니다.");
        sessionStorage.clear();
        this.$router.push("/login");
      } catch (error) {
        console.error(error);
        alert("회원 탈퇴에 실패했습니다. 다시 시도해주세요.");
      }
    },
    canceldata() {
      this.$router.push("/");
    },
  },
};
</script>

<style>
@import "/src/assets/css/reset.css";
html {
  background-color: white;
}
</style>
