<template>
  <input type="hidden" name="id" id="" :value="hiddenid" />
  <input
    type="password"
    name="password"
    id=""
    value=""
    v-model="user.password"
    placeholder="비밀번호 입력"
  />
  <input
    type="text"
    name="name"
    id=""
    value=""
    v-model="user.name"
    placeholder="이름 입력"
  />
  <input
    type="text"
    name="nickname"
    id=""
    value=""
    v-model="user.nickname"
    placeholder="닉네임 입력"
  />
  <input type="hidden" name="role" id="" value="" v-model="user.role" />
  <input type="button" @click="upd" value="수정" />
  <input type="button" @click="canceldatas" value="취소" />
</template>

<script>
export default {
  data() {
    return {
      user: {
        id: sessionStorage.getItem("id"),
        password: "",
        name: "",
        nickname: "",
        role: sessionStorage.getItem("role"),
      },
    };
  },
  methods: {
    canceldatas() {
      this.$router.push("/");
    },
    hiddenid() {
      sessionStorage.getItem("id");
    },
    async upd() {
      await this.$store.dispatch("updateUser", this.user);
      this.$router.push("/login");
    },
  },
};
</script>

<style></style>
