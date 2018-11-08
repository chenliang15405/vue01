import VueRouter from "vue-router";


import Home from "@/components/home/Home"
import Movie from "@/components/movie/movie"
import Title from "@/components/Title"

const routes = [
  {path:"/",redirect:'/title/home'},
  {
    path:"/title",
    component:Title,
    children:[
      {path:"home",component:Home},
      {path:"movie",component:Movie}
    ]
  },


]



const router = new VueRouter({
  routes
})


//把对象暴露出去
export  default router
