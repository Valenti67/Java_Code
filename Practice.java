package com.peixinchen.javase.learn_string;

import java.util.Arrays;

public class Practice {
    public static void main1(String[] args) {
        String[] names = {"hello.png", "hello.jpg", "world.exe", "world.txt", "gjpg.txt"};

        // 只想打印出 hello.png 和 hello.jpg
        for (String name : names) {
//            if (name.contains("png") || name.contains("jpg")) {
//                System.out.println(name);
//            }
            if (name.endsWith(".png") || name.endsWith(".jpg")) {
                System.out.println(name);
            }
        }
    }

    public static void main2(String[] args) {
        String[] names = {"孙悟空", "猪八戒", "唐三藏", "沙僧", "孙权"};
        for (String name : names) {
            if (name.startsWith("孙") && name.length() == 2) {
                System.out.println(name);
            }
        }
    }

    public static void main3(String[] args) {
        //String s = "https://docs.oracle.com/javase/8/docs/api/java/lang/String.html";
        String s = "https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html";
        //String s = "https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html";

//        int idx = s.lastIndexOf('/');
//        System.out.println(s.substring(idx + 1, s.length() - 5));

        String[] group = s.split("/");
        String[] result = new String[group.length - 7];
        for (int i = 7; i < group.length; i++) {
            result[i - 7] = group[i];
        }

        System.out.println(Arrays.toString(result));

        String className = result[result.length - 1];
        className = className.substring(0, className.length() - 5);
        result[result.length - 1] = className;

        System.out.println(Arrays.toString(result));

        String classNameWithPackage = String.join(".", result);
        System.out.println(classNameWithPackage);
    }

    public static void main4(String[] args) {
        String s = "java.util.Scanner";

        // https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
        String t = String.format("https://docs.oracle.com/javase/8/docs/api/%s.html", s.replace(".", "/"));

        System.out.println(t);
    }

    public static void main(String[] args) {
        String s = "package com.peixinchen.javase.learn_string;\n" +
                "\n" +
                "import java.util.Arrays;\n" +
                "import java.util.Scanner;\n" +
                "\n" +
                "public class HelloWorld {\n" +
                "    public static void main(String[] args) {\n" +
                "        long[] array = new long[5];\n" +
                "        Scanner s = new Scanner(System.in);\n" +
                "        for (int i = 0; i < 5; i++) {\n" +
                "            array[i] = s.nextLong();\n" +
                "        }\n" +
                "        System.out.println(Arrays.toString(array));\n" +
                "    }\n" +
                "}";
        String[] lines = s.split("\n");
        for (int i = 1; i <= lines.length; i++) {
            String line = lines[i - 1];
            if (line.startsWith("package ")) {
                System.out.println(line.substring(8, line.length() - 1));
            } else if (line.startsWith("import ")) {
                System.out.println(line.substring(7, line.length() - 1));
            } else if (line.startsWith("public class ")) {
                System.out.println(line.substring(13, line.length() - 2));
            }
        }

        // 这份源码属于哪个包？  com.peixinchen.javase.learn_string
        // 这份源码导入了哪些类？
        // java.uti.Arrays
        // java.util.Scanner
        // 这份源码定义的类名是什么？
        // HelloWorld
    }
}
