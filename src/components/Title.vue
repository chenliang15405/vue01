<template>
  <div class="title">
    <div class="lunbo">
        <img src="../assets/logo.png"/>
    </div>
    <div class="function">

      <tab :line-width=2 active-color='#fc378c' v-model="index">
        <tab-item class="vux-center" :selected="index == 0" v-for="(item, index) in list2" @click="demo2 = item" :key="index">{{item}}</tab-item>
      </tab>
      <swiper v-model="index" height="100px" :show-dots="false">
        <swiper-item v-for="(item, index) in list2" :key="index">
          <div class="tab-swiper vux-center">
              <Home v-if="index == 0"></Home>
              <movie v-if="index == 2"></movie>
          </div>
        </swiper-item>
      </swiper>

    </div>
  </div>
</template>

<script>
  import { Tab, TabItem, Sticky, Divider, XButton, Swiper, SwiperItem } from 'vux'
  import Home from "./home/Home"
  import movie from "./movie/movie"

  const list = () => ['精选', '美食', '电影', '酒店', '外卖']

  export default {
    components: {
      Tab,
      TabItem,
      XButton,
      Swiper,
      SwiperItem,
      Home,
      movie
    },
    data () {
      return {
        list2: list(),
        index: 0,
        demo2: '美食',
      }
  },
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  /*@import '~vux/src/styles/1px.less';*/
  /*@import '~vux/src/styles/center.less';*/


  .title{
    border: 1px solid red;
    width: 100%;
    height:150px;
    padding: 0px;
  }
  .lunbo{
    border: 1px solid blue;
    width: 100%;
    height:100%;

  }
  .function{
    height: 30px;
    width: 100%;
  }

  .tab-swiper {
    background-color: #fff;
    height: 100px;
  }

</style>
