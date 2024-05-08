import axios from "axios";

const instance = axios.create({
  baseURL: "http://localhost:8080/",
});

// 작성하기
export const addboard = async (data) => {
  return await instance.post("board/addboard", data);
};

// 수정하기
export const updboard = async (data) => {
  return await instance.put("board/updboard", data);
};

// 삭제하기
export const delboard = async (no) => {
  return await instance.delete("board/delboard/" + no);
};

// 1개 보기
export const getboard = async (no) => {
  return await instance.get("board/" + no);
};

// 전체보기
export const getboards = async () => {
  return await instance.get("board");
};
