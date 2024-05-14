<template>
  <div>
    <input type="text" placeholder="아이디 입력" v-model="user.id" />
    <input
      type="password"
      placeholder="비밀번호 입력"
      v-model="user.password"
    />
    <input type="button" value="회원 탈퇴" @click="deluserdata" />
  </div>
</template>

<script>
export default {
  name: "Deluser",
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
      await this.$store.dispatch("deleteUser", this.user);
      if (this.user.id == "" || this.user.password == "") {
        alert("아이디 또는 비밀번호를 입력하세요.");
        return;
      } else if (sessionStorage.getItem("id") != this.user.id) {
        alert("아이디를 확인해 주세요.");
        return;
      } else if (sessionStorage.getItem("password") != this.user.password) {
        alert("비밀번호를 확인해 주세요.");
        return;
      }
      sessionStorage.clear();
      this.$router.push("/login");
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
