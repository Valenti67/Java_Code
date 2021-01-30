package com.peixinchen.javase.learn_string;

public class StringMethodDemo {
    public static void main1(String[] args) {
        String s = "hello world";

        String t = s.toUpperCase();
        System.out.println(t);

        String o = t.toLowerCase();
        System.out.println(o);
    }

    public static void main2(String[] args) {
        String s = "Hello world";
        boolean b = s.contains("O w");
        System.out.println(b);
    }

    public static void main3(String[] args) {
        String s = "Hello world";
        boolean b = s.startsWith("hel");
        System.out.println(b);

        boolean c = s.startsWith("Hel", 0);
        System.out.println(c);  // true
        boolean d = s.startsWith("Hel", 1);
        System.out.println(d);  // false
    }

    public static void main4(String[] args) {
        String s = "Hello World";
        boolean b = s.endsWith("rld");
        System.out.println(b);
    }

    public static void main5(String[] args) {
        String s = "hello";
        String t = "Hello";

        // System.oute.println(s == t); // 比较 s 和 t 是否指向同一个对象的
        boolean b = s.equals(t);    // s 指向的 String 对象和 t 指向的 String 对象  “相等”
        System.out.println(b);

        boolean c = s.equalsIgnoreCase(t);  // 大小写不敏感的比较
        System.out.println(c);      // true
    }

    public static void main6(String[] args) {
//        String s = "Hello";
//        String t = "World";
//
//        int r = s.compareTo(t);
//        System.out.println(r);  // r < 0

//        String s = "Hello";
//        String t = "HELLO";
//
//        int r = s.compareToIgnoreCase(t);
//        System.out.println(r);  // r == 0
    }

    public static void main7(String[] args) {
        String s = "Hello";
        String t = "World";
        String o = s.concat(t);
        System.out.println(o);

        String p = s + t;
        System.out.println(p);
    }

    public static void main8(String[] args) {
        String s = String.format("Hello %09d World %s", 18, "nihao");
        System.out.println(s);
    }

    public static void main9(String[] args) {
        String s = "";
        System.out.println(s.isEmpty());
        System.out.println(s.length() == 0);
    }

    public static void main(String[] args) {
        String s = "\t\tHel    lo     \n";

        System.out.println("|" + s + "|");

        String t = s.trim();

        System.out.println("|" + t + "|");
    }
}
