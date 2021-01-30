package com.peixinchen.javase.learn_string;

public class String的不可变特性 {
//    public static void main(String[] args) {
//        String s = "Hello World";
//        String t = s.substring(3);
//
//        System.out.println(s == t); // s 指向的对象不可变，永远会创建新的对象
//    }

    public static void main1(String[] args) {
        String s = "H";     // 创建一个对象 "H"

        for (int i = 0; i < 10; i++) {
            s = s + i;      // 创建一个新的对象
        }

        System.out.println(s);
    }

    public static void main2(String[] args) {
        StringBuilder sb = new StringBuilder("H");     // 创建一个对象 "H"

        for (int i = 0; i < 10; i++) {
            sb.append(i);      // 创建一个新的对象
        }

        String s = sb.toString();

        System.out.println(s);
    }

    public static void main(String[] args) {
//        String s = "Hello";
//        String t = "Hello";
//
//        System.out.println(s.equals(t));    // s 和 t 对象是否相等
//        System.out.println(s == t);         // s 和 t 是否指向同一个对象
        /*
        Java 内部做优化了
        1. 由于 String 不可变，所以，只要明确两个对象的值相等的情况下
           尽可能的让这些引用都指向一个对象，可以有效的减少空间的消耗
         */

//        String s = "Hello";
//        // 因为我明确使用 new 了，所以 Java 必须创建一个新的对象
//        String t = new String("Hello");
//
//        System.out.println(s.equals(t));
//        System.out.println(s == t);

        // 不要把编译器想的太傻，两个字面量进行 concat，编译器就已经帮你优化成 "Hello World"
//        String s = "Hello " + "World";
//        String t = "Hello World";
//
//        System.out.println(s.equals(t));
//        System.out.println(s == t);

        String o = "World";
        // String s = "Hello " + o;    // 不是字面量
        String s = "Hello ".concat(o);

        String t = "Hello World";

        System.out.println(s.equals(t));
        System.out.println(s == t);
    }
}
