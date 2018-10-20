<template>
  <div class="title">
    <div class="lunbo">
        <img src="../assets/logo.png"/>
    </div>
    <div class="function">

      <tab :line-width=2 active-color='#fc378c' v-model="index">
          <tab-item class="vux-center" :selected="menu == index" v-for="(item, index) in list2"  :key="index">
              <!--<a @click.prevent="showView(index)">{{item}}</a>-->
            <router-link v-if="index == 0" to="/home">{{item}}</router-link>
            <router-link v-if="index == 1" to="/food">{{item}}</router-link>
            <router-link v-if="index == 2" to="/movie">{{item}}</router-link>
            <router-link v-if="index == 3" to="/bill">{{item}}</router-link>
            <router-link v-if="index == 4" to="/person">{{item}}</router-link>
          </tab-item>
      </tab>
      <swiper v-model="index" height="100px" :show-dots="false">
        <swiper-item v-for="(item, index) in list2" :key="index" >
          <div class="tab-swiper vux-center">
              <router-view></router-view>
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
        menu:0
      }
  },
    methods:{
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  /*@import '~vux/src/styles/1px.less';*/
  /*@import '~vux/src/styles/center.less';*/

  /* 下面的两行配置是去除掉a标签的自带的样式，并且设置选中的颜色*/
  a:link,a:visited{color:#444;text-decoration:none;}
  a:hover{color:rgb(252, 55, 140);}

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
