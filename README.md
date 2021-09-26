# ZlifeCycle
很多时候，一些功能都需要知道生命周期来实现一些特定的功能；或者当你写一个工具，比如下载功能，又得复制粘贴一下；所以封装了一下 -- ZLifeCycle
调用非常简单，如下：

![](https://p1-jj.byteimg.com/tos-cn-i-t2oaga2asx/gold-user-assets/2019/2/12/168dfc078c98ef65~tplv-t2oaga2asx-image.image)

只需要传入 context 就可以了，后面监听可以拿自己想要的周期去做一些功能即可。

调用如下：

工程如下：https://github.com/LillteZheng/ZlifeCycle

或者直接关联

```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
然后关联

```
implementation 'com.github.LillteZheng:ZlifeCycle:v1.1'
```

需要使用 java8

```aidl
compileOptions {
    sourceCompatibility JavaVersion.VERSION_1_8
    targetCompatibility JavaVersion.VERSION_1_8
}
```
当然支持 jar 的形式，请下载最新jar：

![](https://p1-jj.byteimg.com/tos-cn-i-t2oaga2asx/gold-user-assets/2019/2/12/168dfca9b1fbe370~tplv-t2oaga2asx-image.image)

版本更新

-1.1 增加 onSaveInstanceState 和 onLowMemory
-1.0 完成基本功能