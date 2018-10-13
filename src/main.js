// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import { AlertPlugin, ToastPlugin } from 'vux'
import iView from 'iview';
import 'iview/dist/styles/iview.css';
import vuei18n from "vue-i18n";
import axios from "axios";


Vue.prototype.$http = axios

Vue.use(AlertPlugin)
Vue.use(ToastPlugin)

Vue.use(iView);

Vue.use(vuei18n);


Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  components: { App },
  template: '<App/>'
})
