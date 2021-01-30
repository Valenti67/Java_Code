package com.peixinchen.javase.learn_string;

import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        long[] array = new long[5];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            array[i] = s.nextLong();
        }
        System.out.println(Arrays.toString(array));
    }
}
