import { getMovies, addMovie, delMovie } from "@/api/movie";

export default {
  state: {
    movies: [], // 1
  },
  mutations: {
    setMovies(state, movies) {
      state.movies = movies; // (1) = (2)
    },
    addMovie(state, movie) {
      state.movies.push(movie);
    },
    removeMovie(state, no) {
      state.movies = state.movies.filter((movie) => movie.no !== no);
    },
  },
  actions: {
    async fetchMovies({ commit }) {
      const responce = await getMovies();
      commit("setMovies", responce.data); // 2
    },
    async insertMovie({ commit }, data) {
      const responce = await addMovie(data);
      commit("addMovie", responce.data);
    },
    async deleteMovie({ commit }, no) {
      await delMovie(no);
      commit("removeMovie", no);
    },
  },
};
