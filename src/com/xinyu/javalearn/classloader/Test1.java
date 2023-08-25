package com.xinyu.javalearn.classloader;

import java.util.ArrayList;

public class Test1 {

    /**
     * 三个类加载器，
     * 1.应用类加载器: 加载自己写的类
     * 2.平台(扩展)类加载器: 加载Java核心类的扩展部分(/lib/ext 目录下的类)
     * 3.根类加载器: Java 平台核心类诸如 java.lang.Object 和 java.lang.Thread 等以及 rt.jar中的类。
     * 先是应用类加载器出动加载客户程序，它自己不做，交给
     * 上层的扩展类加载器，再交给根类加载器。之后方向反过来，根类加载器发现不能加载，
     * 就返给扩展类加载器，如果还是加载不了，最后再返给应用类加载器。
     * <p>
     * jdk17
     * jdk.internal.loader.ClassLoaders$AppClassLoader@63947c6b
     * jdk.internal.loader.ClassLoaders$PlatformClassLoader@119d7047
     * null  (因为根类加载器是本地代码，所以不在 JVM中，于是返回的是 null)
     * <p>
     * jdk1.8
     * sun.misc.Launcher$AppClassLoader@18b4aac2
     * sun.misc.Launcher$ExtClassLoader@1b6d3586
     * null
     */
    public static void main(String[] args) {
        ClassLoader classLoader = Test1.class.getClassLoader();
        System.out.println(classLoader);

        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);

        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);
    }
}
