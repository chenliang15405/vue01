<template>

  <div class="movie">
      This is movie
      <div class="imgage">
         <img src=""/>
         <p class="title"></p>
         <p class="description"></p>
      </div>

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
        created(){
          this.getMovieList()
        },
        methods:{
            getMovieList(){
                  //TODO 使用axios中的json请求对应的数据，安装jsonp模块
                  // this.$http.jsonP("http://api.douban.com/v2/movie/top250").then(result => {
                  //       console.log(result)
                  // })
            }
        }
    }
</script>

<style scoped>

</style>
