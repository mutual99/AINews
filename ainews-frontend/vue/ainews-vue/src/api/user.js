import axios from "axios";

const instance = axios.create({
  baseURL: "http://localhost:8080/",
});

export const register = async (data) => {
  return await instance.post("user/register", data);
};

export const login = async (data) => {
  return await instance.post("user/login" + data);
};

export const upduser = async (data) => {
  return await instance.put("user/upduser" + data);
};

export const deluser = async (id) => {
  return await instance.delete("user/deluser/" + id);
};
