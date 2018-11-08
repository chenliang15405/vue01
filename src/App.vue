<template>
  <div>
      <x-header  title="title"></x-header>
      <router-view></router-view>
  </div>
</template>

<script>
import { XHeader } from 'vux'
  export default{
    components:{
        XHeader
      }
    }

</script>

<style lang="less">
  @import '~vux/src/styles/close.less';
</style>
