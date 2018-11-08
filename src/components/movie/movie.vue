<template>

  <div class="movie">
      <div class="hot-movie">
          热门电影
      </div>
      <div></div>

  </div>

</template>

<script>
    export default {
        name: "movie",
        data(){
          return{
              movieList:[]
          }
        },
        mounted(){
          this.getMovieList()
        },
        methods:{
            getMovieList(){
                  //在index.js中配置了对应的proxy，将/api 进行代理 并打开跨域，如果是npm run build的时候，在生产环境，则不能够访问，需要配置代理，可以使用nginx代理或者配置jsonp模块
                  this.axios.get("/api/movie/top250").then(result => {
                        console.log(result)
                  })
            }
        }
    }
</script>

<style scoped>

</style>
