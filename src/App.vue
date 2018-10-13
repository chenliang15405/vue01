<template>
  <div>
      <x-header  title="title"></x-header>
    <Title></Title>


  </div>
</template>

<script>
import  Title from "./components/Title"
import { XHeader } from 'vux'

  export default{
    components:{
        Title,
        XHeader
      }
    }

</script>

<style lang="less">
  @import '~vux/src/styles/close.less';
</style>
