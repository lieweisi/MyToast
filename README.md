自定义吐司


自定义Toast  
===================================  
  
### 库实现功能 
    防止魅族等机型关闭通知后软件无提示。            
  
   
    
### 1.在项目bulid.gradle中添加
    allprojects {
    repositories {
        jcenter()
        maven { url 'https://jitpack.io' }
    }
### 2.在app的bulid.gradle中添加引用  
    compile 'com.github.lieweisi:MyToast:v0.1'
    
### 参考代码
    MyToast.showLong(this,"哈罗!");
    //使用方式与系统Toast相差不大，注意获取的Context是activity.this
   
