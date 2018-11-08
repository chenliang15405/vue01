<template>

  <div class="home">
      <div class="v1-time">{{nowDate | dataformat('yyyy-MM-dd HH:mm:ss')}}</div>
      <div class="card-view">
        <ul>
          <a href="#"><li>记账</li></a>
          <a href="#"><li>账单</li></a>
          <a href="#"><li>点餐</li></a>
          <a href="#"><li>设置</li></a>
        </ul>
      </div>

  </div>

</template>

<script>
    export default {
        name: "Home",
        data(){
          return{
             nowDate: new Date()
          }
        }

    }
</script>

<style scoped lang="scss">
    .home {
      .v1-time {
        height: 50px;
        background-color: pink;
        text-align: center;
        line-height: 50px;
        font-size: 1rem;
      }
      .card-view {
        width: 340px;
        height: 300px;
        margin: 0px auto;
        font-size: 15px;
        li {
          list-style: none;
          margin-left:45px;
          margin-top:50px;
          background-color: gray;
          height: 100px;
          width: 100px;
          float: left;
          text-align: center;
          line-height: 100px;
          border-radius: 10px;
        }
        a {
          text-decoration: none;
          color: #000;
        }
      }
    }
</style>
