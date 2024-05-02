import axios from "axios";

const instance = axios.create({
  baseURL: "http://localhost:8080/",
});

export const adduser = async () => {
  return await instance.post("user/register");
};

export const userlogin = async () => {
  return await instance.post("user/login");
};
