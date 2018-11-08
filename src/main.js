// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import VueRouter from "vue-router"
import { AlertPlugin, ToastPlugin } from 'vux'
import iView from 'iview';
import 'iview/dist/styles/iview.css'
import vuei18n from "vue-i18n"
import axios from "axios"
import Qs from 'qs'

import router from "./components/router/index.js"



Vue.use(VueRouter);

Vue.prototype.axios = axios
Vue.prototype.qs = Qs

Vue.use(AlertPlugin)
Vue.use(ToastPlugin)

Vue.use(iView);

Vue.use(vuei18n);

/*
   全局时间过滤器,并且可以传递参数，表示定义的规则来返回对应的时间格式。
 */
Vue.filter("dataformat",function(data,format){
  var date = new Date(data);

  var formatDate = "";
  //ES6中补全string padStart(length,content)  padEnd(length,content)
  let y = date.getFullYear();
  let m = (date.getMonth()+1).toString().padStart(2,0);
  let d = (date.getDate()).toString().padStart(2,0);

  formatDate = `${y}-${m}-${d}`;

  if(format === 'yyyy-MM-dd HH:mm:ss'){
    let h = (date.getHours()).toString().padStart(2,0);
    let mi = (date.getMinutes()).toString().padStart(2,0);
    let s = (date.getSeconds()).toString().padStart(2,0);

    formatDate = `${y}-${m}-${d} ${h}:${mi}:${s}`;
  }
  return formatDate;
})



Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  components: { App },
  template: '<App/>',
  router
})
