(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/zuoyexinxi/add-or-update"],{2731:function(e,n,r){"use strict";(function(e){r("74cf");t(r("66fd"));var n=t(r("2aa8"));function t(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,r("543d")["createPage"])},"2aa8":function(e,n,r){"use strict";r.r(n);var t=r("f963"),u=r("f6fc");for(var i in u)"default"!==i&&function(e){r.d(n,e,(function(){return u[e]}))}(i);r("527b");var a,o=r("f0c5"),c=Object(o["a"])(u["default"],t["b"],t["c"],!1,null,"2514299c",null,!1,t["a"],a);n["default"]=c.exports},"376c":function(e,n,r){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var t=u(r("a34a"));function u(e){return e&&e.__esModule?e:{default:e}}function i(e,n,r,t,u,i,a){try{var o=e[i](a),c=o.value}catch(s){return void r(s)}o.done?n(c):Promise.resolve(c).then(t,u)}function a(e){return function(){var n=this,r=arguments;return new Promise((function(t,u){var a=e.apply(n,r);function o(e){i(a,t,u,o,c,"next",e)}function c(e){i(a,t,u,o,c,"throw",e)}o(void 0)}))}}var o=function(){Promise.all([r.e("common/vendor"),r.e("components/w-picker/w-picker")]).then(function(){return resolve(r("4f12"))}.bind(null,r)).catch(r.oe)},c={data:function(){return{ruleForm:{zuoyebianhao:"",zuoyetimu:"",zuoyeleixing:"",tupian:"",banji:"",zuoyeneirong:"",shijian:"",xuehao:"",xueshengxingming:"",thumbsupnum:"",crazilynum:""},zuoyeleixingOptions:[],zuoyeleixingIndex:0,user:{},ro:{zuoyebianhao:!1,zuoyetimu:!1,zuoyeleixing:!1,tupian:!1,banji:!1,zuoyeneirong:!1,shijian:!1,xuehao:!1,xueshengxingming:!1,thumbsupnum:!1,crazilynum:!1}}},components:{wPicker:o},computed:{},onLoad:function(n){var r=this;return a(t.default.mark((function u(){var i,a,o,c;return t.default.wrap((function(u){while(1)switch(u.prev=u.next){case 0:return i=e.getStorageSync("nowTable"),u.next=3,r.$api.session(i);case 3:return a=u.sent,r.user=a.data,r.ruleForm.banji=r.user.banji,r.ruleForm.xuehao=r.user.xuehao,r.ruleForm.xueshengxingming=r.user.xueshengxingming,u.next=10,r.$api.option("zuoyeleixing","zuoyeleixing",{});case 10:if(a=u.sent,r.zuoyeleixingOptions=a.data,r.ruleForm.userid=e.getStorageSync("userid"),n.refid&&(r.ruleForm.refid=n.refid,r.ruleForm.nickname=e.getStorageSync("nickname")),!n.id){u.next=20;break}return r.ruleForm.id=n.id,u.next=18,r.$api.info("zuoyexinxi",r.ruleForm.id);case 18:a=u.sent,r.ruleForm=a.data;case 20:if(!n.cross){u.next=71;break}o=e.getStorageSync("crossObj"),u.t0=t.default.keys(o);case 23:if((u.t1=u.t0()).done){u.next=71;break}if(c=u.t1.value,"zuoyebianhao"!=c){u.next=29;break}return r.ruleForm.zuoyebianhao=o[c],r.ro.zuoyebianhao=!0,u.abrupt("continue",23);case 29:if("zuoyetimu"!=c){u.next=33;break}return r.ruleForm.zuoyetimu=o[c],r.ro.zuoyetimu=!0,u.abrupt("continue",23);case 33:if("zuoyeleixing"!=c){u.next=37;break}return r.ruleForm.zuoyeleixing=o[c],r.ro.zuoyeleixing=!0,u.abrupt("continue",23);case 37:if("tupian"!=c){u.next=41;break}return r.ruleForm.tupian=o[c],r.ro.tupian=!0,u.abrupt("continue",23);case 41:if("banji"!=c){u.next=45;break}return r.ruleForm.banji=o[c],r.ro.banji=!0,u.abrupt("continue",23);case 45:if("zuoyeneirong"!=c){u.next=49;break}return r.ruleForm.zuoyeneirong=o[c],r.ro.zuoyeneirong=!0,u.abrupt("continue",23);case 49:if("shijian"!=c){u.next=53;break}return r.ruleForm.shijian=o[c],r.ro.shijian=!0,u.abrupt("continue",23);case 53:if("xuehao"!=c){u.next=57;break}return r.ruleForm.xuehao=o[c],r.ro.xuehao=!0,u.abrupt("continue",23);case 57:if("xueshengxingming"!=c){u.next=61;break}return r.ruleForm.xueshengxingming=o[c],r.ro.xueshengxingming=!0,u.abrupt("continue",23);case 61:if("thumbsupnum"!=c){u.next=65;break}return r.ruleForm.thumbsupnum=o[c],r.ro.thumbsupnum=!0,u.abrupt("continue",23);case 65:if("crazilynum"!=c){u.next=69;break}return r.ruleForm.crazilynum=o[c],r.ro.crazilynum=!0,u.abrupt("continue",23);case 69:u.next=23;break;case 71:r.styleChange();case 72:case"end":return u.stop()}}),u)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},shijianChange:function(e){this.ruleForm.shijian=e.target.value,this.$forceUpdate()},zuoyeleixingChange:function(e){this.zuoyeleixingIndex=e.target.value,this.ruleForm.zuoyeleixing=this.zuoyeleixingOptions[this.zuoyeleixingIndex]},tupianTap:function(){var e=this;this.$api.upload((function(n){e.ruleForm.tupian=e.$base.url+"upload/"+n.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=this;return a(t.default.mark((function n(){return t.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:if(e.ruleForm.zuoyebianhao){n.next=3;break}return e.$utils.msg("作业编号不能为空"),n.abrupt("return");case 3:if(e.ruleForm.zuoyetimu){n.next=6;break}return e.$utils.msg("作业题目不能为空"),n.abrupt("return");case 6:if(e.ruleForm.zuoyeleixing){n.next=9;break}return e.$utils.msg("作业类型不能为空"),n.abrupt("return");case 9:if(e.ruleForm.banji){n.next=12;break}return e.$utils.msg("班级不能为空"),n.abrupt("return");case 12:if(!e.ruleForm.thumbsupnum||e.$validate.isIntNumer(e.ruleForm.thumbsupnum)){n.next=15;break}return e.$utils.msg("赞应输入整数"),n.abrupt("return");case 15:if(!e.ruleForm.crazilynum||e.$validate.isIntNumer(e.ruleForm.crazilynum)){n.next=18;break}return e.$utils.msg("踩应输入整数"),n.abrupt("return");case 18:if(!e.ruleForm.id){n.next=23;break}return n.next=21,e.$api.update("zuoyexinxi",e.ruleForm);case 21:n.next=25;break;case 23:return n.next=25,e.$api.add("zuoyexinxi",e.ruleForm);case 25:e.$utils.msgBack("提交成功");case 26:case"end":return n.stop()}}),n)})))()},optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var n=new Date,r=n.getFullYear(),t=n.getMonth()+1,u=n.getDate();return"start"===e?r-=60:"end"===e&&(r+=2),t=t>9?t:"0"+t,u=u>9?u:"0"+u,"".concat(r,"-").concat(t,"-").concat(u)},toggleTab:function(e){this.$refs[e].show()}}};n.default=c}).call(this,r("543d")["default"])},"527b":function(e,n,r){"use strict";var t=r("a3e9"),u=r.n(t);u.a},a3e9:function(e,n,r){},f6fc:function(e,n,r){"use strict";r.r(n);var t=r("376c"),u=r.n(t);for(var i in t)"default"!==i&&function(e){r.d(n,e,(function(){return t[e]}))}(i);n["default"]=u.a},f963:function(e,n,r){"use strict";var t;r.d(n,"b",(function(){return u})),r.d(n,"c",(function(){return i})),r.d(n,"a",(function(){return t}));var u=function(){var e=this,n=e.$createElement;e._self._c},i=[]}},[["2731","common/runtime","common/vendor"]]]);