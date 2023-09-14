package com.xinyu.javalearn.generics;

public class GenericMethodTest {

    // E, T, K, V
    public static <E> void printArray(E[] eArray) {
        for (E e : eArray) {
            System.out.print(e + " ");
        }
    }

    // 编译之后 printArray(E[])其实变成了 printArray(Object[])。
    // 定义个一样的会报错
//    public static void printArray(Object[] eArray) {
//        for (Object e : eArray) {
//            System.out.print(e + " ");
//        }
//    }

    public static void main(String[] args) {
        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.618, 2.71828, 3.14159};
        String[] sArray = {"I", "love", "beijing", "tiananmen"};

        printArray(iArray);
        printArray(dArray);
        printArray(sArray);
    }


}
