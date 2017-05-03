自定义Toast  
===================================  
  
### 库实现功能 
    防止魅族等机型关闭通知后软件无提示。            
  
### 多行文本框    
    1.在项目bulid.gradle中添加
### 比如我们可以在多行文本框里输入一段代码,来一个Java版本的HelloWorld吧  
    public class HelloWorld {  
  
      /**  
      * @param args  
   */  
   public static void main(String[] args) {  
   System.out.println("HelloWorld!");  
  
   }  
  
    }  
allprojects {
    repositories {
        jcenter()
        maven { url 'https://jitpack.io' }
    }
    2.在app的bulid.gradle中添加引用
compile 'com.github.lieweisi:MyToast:v0.1' 
   
