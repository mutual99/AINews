import axios from "axios";

const instance = axios.create({
  baseURL: "http://localhost:8080/",
});

export const adduser = async (data) => {
  return await instance.post("user/register", data);
};

export const userlogin = async (data) => {
  return await instance.post("user/login", data);
};
