<template>
  <div class="title">
    <div class="lunbo">

    </div>
    <div class="function">

      <tab :line-width=2 active-color='#fc378c' v-model="index">
          <tab-item class="vux-center" :selected="menu == index" v-for="(item, index) in list2"  :key="index">
              <!--<a @click.prevent="showView(index)">{{item}}</a>-->
            <router-link v-if="index == 0" to="/title/home">{{item}}</router-link>
            <router-link v-if="index == 1" to="/title/food">{{item}}</router-link>
            <router-link v-if="index == 2" to="/title/movie">{{item}}</router-link>
            <router-link v-if="index == 3" to="/title/bill">{{item}}</router-link>
            <router-link v-if="index == 4" to="/title/person">{{item}}</router-link>
          </tab-item>
      </tab>
      <swiper  v-model="index"  :show-dots="false">
        <swiper-item v-for="(item, index) in list2" :key="index">
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

  const list = () => ['精选', '美食', '电影', '音乐', '更多']

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
<style>
  /*
    重新定义style覆盖掉vux中组件的默认的行内style， !important 是提高优先级
   */
  .vux-swiper{
    height: 400px!important;
  }

</style>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
  /*@import '~vux/src/styles/1px.less';*/
  /*@import '~vux/src/styles/center.less';*/

  /* 下面的两行配置是去除掉a标签的自带的样式，并且设置选中的颜色*/
  a:link,a:visited{
    color:#444;
    text-decoration:none;
  }
  a:hover{
    color:rgb(252, 55, 140);
  }
  a{
    display: block;
    height: 44px;
    width: 82px;
  }
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

  .vux-slider{
    overflow: visible;
  }

  .tab-swiper {
    background-color: #fff;
  }
</style>
