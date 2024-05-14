import axios from "axios";

const instance = axios.create({
  baseURL: "http://localhost:8080/",
});

// 회원가입
export const adduser = async (data) => {
  return await instance.post("user/register", data);
};

// 로그인
export const userlogin = async (data) => {
  return await instance.post("user/login", data);
};

// 회원정보 수정
export const upduser = async (data) => {
  return await instance.put("user/upduser", data);
};

// 회원정보 탈퇴
export const deluser = async (data) => {
  return await instance.delete("user/deluser", data);
};

// 회원정보 갖고 오기
export const getuser = async (id) => {
  return await instance.get("user/" + id);
};

// 전체 회원 정보
export const getusers = async () => {
  return await instance.get("user");
};
