<template>
  <div class="title">
    <div class="lunbo">

    </div>
    <div class="function">

      <!--<tab :line-width=2 active-color='#fc378c' v-model="index">
          <tab-item class="vux-center" :selected="menu == index" v-for="(item, index) in list2"  :key="index">
              &lt;!&ndash;<a @click.prevent="showView(index)">{{item}}</a>&ndash;&gt;
            &lt;!&ndash;<router-link v-if="index == 0" to="/title/home">{{item}}</router-link>
            <router-link v-if="index == 1" to="/title/food">{{item}}</router-link>
            <router-link v-if="index == 2" to="/title/movie">{{item}}</router-link>
            <router-link v-if="index == 3" to="/title/bill">{{item}}</router-link>
            <router-link v-if="index == 4" to="/title/person">{{item}}</router-link>&ndash;&gt;
            <a @click="toPage(index)">{{item}}</a>
          </tab-item>
      </tab>
      <swiper  v-model="index"  :show-dots="false">
        <swiper-item v-for="(item, index) in list2" :key="index">
          <div class="tab-swiper vux-center">
              <router-view></router-view>
          </div>
        </swiper-item>
      </swiper>-->

      <nav class="mui-bar mui-bar-tab">
        <a class="mui-tab-item mui-active" href="#tabbar">
          <span class="mui-icon mui-icon-home"></span>
          <span class="mui-tab-label">首页</span>
        </a>
        <a class="mui-tab-item" href="#tabbar-with-chat">
          <span class="mui-icon mui-icon-email"><span class="mui-badge">9</span></span>
          <span class="mui-tab-label">消息</span>
        </a>
        <a class="mui-tab-item" href="#tabbar-with-contact">
          <span class="mui-icon mui-icon-contact"></span>
          <span class="mui-tab-label">通讯录</span>
        </a>
        <a class="mui-tab-item" href="#tabbar-with-map">
          <span class="mui-icon mui-icon-gear"></span>
          <span class="mui-tab-label">设置</span>
        </a>
      </nav>

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
      /*toPage(index){
        //根据不同的index，跳转不同的路由
         if(index == 0){
           this.$router.push("/title/home")
         }else if (index == 1){
           this.$router.push("/title/food")
         }else if (index == 2){
           this.$router.push("/title/movie")
         }else if (index == 3){
           this.$router.push("/title/bill")
         }else if (index == 4){
           this.$router.push("/title/person")
         }
      }*/
    }
  }
</script>
<style>
  /*
    重新定义style覆盖掉vux中组件的默认的行内style， !important 是提高优先级
   */
  .vux-swiper{
    height: 1000px!important;
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
    width: 100%;
    height: 620px;
    padding: 0px;
    overflow: hidden;
  }
  .lunbo{
    border: 1px solid blue;
    height: 150px;

  }
  .function{
    width: 100%;
  }

  .tab-swiper {
    background-color: #fff;
  }
</style>
