import axios from 'axios';

console.log('API baseURL:', import.meta.env.VITE_API_URL);

const api = axios.create({
  baseURL: 'http://localhost:4000/api'
});

export default api;