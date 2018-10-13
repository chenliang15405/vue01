<template>

  <div class="movie">
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
                  this.$http.jsonP("http://api.douban.com/v2/movie/top250").then(result => {
                        console.log(result)
                  })
            }
        }
    }
</script>

<style scoped>

</style>
