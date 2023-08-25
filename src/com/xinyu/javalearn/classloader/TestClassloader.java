package com.xinyu.javalearn.classloader;

public class TestClassloader {

    /**
     * Exception in thread "main" java.lang.RuntimeException: java.lang.ClassNotFoundException: DummyClass
     * at com.xinyu.javalearn.classloader.TestClassloader.main(TestClassloader.java:9)
     * Caused by: java.lang.ClassNotFoundException: DummyClass
     * at java.net.URLClassLoader.findClass(URLClassLoader.java:382)
     * at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
     * at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:349)
     * at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
     * at java.lang.Class.forName0(Native Method)
     * at java.lang.Class.forName(Class.java:264)
     * at com.xinyu.javalearn.classloader.TestClassloader.main(TestClassloader.java:7)
     * <p>
     * new Test(); 步骤
     * 步骤一、类级别的工作
     * 1.加载:  把 class文件字节流就按照虚拟机规范存储在方法区之中， 然后jvm在内存中创建一个 java.lang.Class 类对象放入堆区。
     * class文件(Meta Data 类定义): 类的二进制表示如全名、静态代码、静态变量、方法定义、构造函数说明等等。
     * 类对象(class object 内存表达): 代表类的,无论new 多少个Test(),jvm中始终只有1个。
     * 2.链接: 执行类的链接过程，给类分配内存。如果内存不够,抛出OutOfMemoryError
     * 2.1 验证: class文件是否合规
     * 2.2 准备: 给类里的静态变量分配内存,赋予 默认值
     * 2.3 解析: 利用第一步的方法区,将符号引用转换为直接内存引用。
     * 3.初始化: 完成类的加载,把静态变量赋初始值,执行静态代码块。
     * <p>
     * 步骤二、对象级别的工作
     * 1. 为对象在堆中分配内存
     * 2. 对实例内存进行零值初始化
     * 3. 调用对象的构造函数
     */
    public static void main(String[] args) {
        try {
            Class.forName("DummyClass");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
