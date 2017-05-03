# 自定义Toast
=======
防止魅族等机型关闭通知后软件无提示。\<br> 
使用方法：\<br> 
1.在项目bulid.gradle中添加\<br> 
allprojects {
    repositories {
        jcenter()
        maven { url 'https://jitpack.io' }
    }
2.在app的bulid.gradle中添加引用\<br> 
compile 'com.github.lieweisi:MyToast:v0.1'
