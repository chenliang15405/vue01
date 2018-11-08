<template>

  <div class="movie">
      <div class="hot-movie" v-for="(item,index) in movieList" :key="index">
          <div class="movie-item">
              <h1></h1>
              <p></p>
          </div>
      </div>
  </div>

</template>

<script>
    export default {
        name: "movie",
        data(){
          return{
              movieList:['1','2','3'],
              title:"",
              total:0,
              images:[]
          }
        },
        mounted(){
          //this.getMovieList()
        },
        methods:{
            getMovieList(){
                  //在index.js中配置了对应的proxy，将/api 进行代理 并打开跨域，如果是npm run build的时候，在生产环境，则不能够访问，需要配置代理，可以使用nginx代理或者配置jsonp模块
                  this.axios.get("/douban/movie/top250").then(result => {
                      if(result.status == 200){
                          this.movieList = result.data.subjects;
                          this.title = result.data.title;
                          this.total = result.data.total;
                          console.log(this.movieList);
                          //缓存图片
                          this.movieList.forEach(i => {
                            this.images = this.cacheImages(i.images.medium);
                          })

                      }
                  }).catch(err => {
                        //TODO toast message
                      console.log(err)
                  })
            },
            cacheImages(_url){
                //拼接url,缓存图片，接口的访问次数有限制，所以需要缓存图片
                if(_url != undefined){
                  let _u = _url.substring(7);
                  let cacheUrl = "https://images.weserv.nl/?url=";
                  console.log(cacheUrl + _u)
                  return cacheUrl + _u;
                }
            }
        }
    }
</script>

<style scoped lang="scss">
    .movie{
      border: 1px solid red;
      height: 1000px;
      margin-top: 10px;
      overflow: auto;
      .hot-movie{
        height: 200px;
        width: 90%;
        margin:0 auto -1px;
        border:1px solid #ccc;

      }


    }

</style>
