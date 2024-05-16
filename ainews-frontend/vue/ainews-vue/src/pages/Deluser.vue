<template>
  <div>
    <input
      type="text"
      placeholder="아이디 입력"
      v-model="user.id"
      value="user.id"
    />
    <input
      type="text"
      placeholder="비밀번호 입력"
      v-model="user.password"
      value="user.password"
    />
    <input type="button" value="회원 탈퇴" @click="deluserdata" />
    <input type="button" value="취소" @click="canceldata" />
  </div>
</template>

<script>
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
      await this.$store.dispatch("deleteUser", this.user.id);
      if (this.user.id === "" || this.user.password === "") {
        alert("아이디 또는 비밀번호를 확인하세요.");
        return;
      }
      this.$router.push("/login");
      sessionStorage.clear();
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
