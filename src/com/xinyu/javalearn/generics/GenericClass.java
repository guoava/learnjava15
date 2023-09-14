package com.xinyu.javalearn.generics;

/**
 * 泛型就是一个编译时的处理，内部用了 Object，加上了类型转换和检查
 *
 * @param <T>
 */
public class GenericClass<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    /**
     * 写的是 GenericClass<String> sClass = new GenericClass<String>();，编译后变成了 GenericClass sClass = new GenericClass();
     * 写的时候是 sClass.get()，编译后变成了(String)sClass.get()。编译器自动加上了类型转换和检查
     *
     * @param args
     */
    public static void main(String[] args) {
        GenericClass<String> stringGenericClass = new GenericClass<>();
        stringGenericClass.setT("121");
        System.out.println("stringGenericClass.getT() = " + stringGenericClass.getT());

        GenericClass<Number> numberGenericClass = new GenericClass<>();
        numberGenericClass.setT(1212121);
        System.out.println("numberGenericClass.getT() = " + numberGenericClass.getT());

        // 编译后 擦除了泛型 实质是同一个类
        System.out.println("stringGenericClass.getClass() = " + stringGenericClass.getClass());
        System.out.println("numberGenericClass.getClass() = " + numberGenericClass.getClass());
        System.out.println(stringGenericClass.getClass().equals(numberGenericClass.getClass()));

    }
}
