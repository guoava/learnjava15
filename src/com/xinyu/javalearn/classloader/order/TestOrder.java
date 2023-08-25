package com.xinyu.javalearn.classloader.order;

public class TestOrder {
    static {
        System.out.println("Test static code execute.");
    }

    static Stub testStaticStub = new Stub("Test static object ");

    {
        System.out.println("Test code execute");
    }

    Stub testStub = new Stub("Test  object ");

    /**
     * 1 静态代码最先执行，主程序静态代码 -> 父类静态代码 -> 子类静态代码。
     * 2 执行主程序 main()
     * 3 父类非静态代码 -> 父类实例队形初始化 -> 父类构造函数
     * 4 子类非静态代码 -> 子类实例队形初始化 -> 子类构造函数
     * 5 普通方法
     *
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Test Main execute:");

        Child child = new Child();

        // 子类覆盖的方法调用，无论是 c.sayHello(); 还是 ((Parent)c).sayHello();
        // 结果都是调用的子类中的方法
        child.sayHello();
        ((Parent) child).sayHello();

    }

}
