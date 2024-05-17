<template>
  <input type="hidden" name="id" v-model="hiddenid" />
  <input
    type="password"
    name="password"
    v-model="user.password"
    placeholder="비밀번호 입력"
  />
  <input type="text" name="name" v-model="user.name" placeholder="이름 입력" />
  <input
    type="text"
    name="nickname"
    v-model="user.nickname"
    placeholder="닉네임 입력"
  />
  <input type="hidden" name="role" id="" v-model="user.role" />
  <input type="button" @click="upd" value="수정" />
  <input type="button" @click="canceldatas" value="취소" />
</template>

<script>
import { secureStorage } from "@/store/user";

export default {
  data() {
    return {
      userid: "",
      user: {
        password: "",
        name: "",
        nickname: "",
        role: "ROLE_USER",
      },
    };
  },
  methods: {
    canceldatas() {
      this.$router.push("/");
    },
    hiddenid() {
      const result = secureStorage.getItem("user");
      console.log(result.id);
      this.userid = result.id;
    },
    async upd() {
      await this.$store.dispatch("updateUser", this.user);
      sessionStorage.clear();
      this.$router.push("/login");
    },
  },
};
</script>

<style></style>
