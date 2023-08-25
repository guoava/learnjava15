package com.xinyu.javalearn.classloader.my;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 类加载器就像是一个汤勺，用它来抓汤圆吃
 * 类加载器不光是加载类，还规定了命名空间，不同的类加载器加载的类是不能互相访问的（正因为这样才会有同一个类的多版本支持的技术）
 */
public class MyClassloader extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        System.out.println("name = " + name);

        String classFileName = name.replace(".", "/") + ".class";
        try {
            Path path = Paths.get(getResource(classFileName).toURI());
            // 可以在此处做修改  比如解密后的byte是需要加载的类
            byte[] classBytes = Files.readAllBytes(path);
            Class<?> aClass = defineClass(name, classBytes, 0, classBytes.length);
            return aClass;
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
