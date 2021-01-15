import java.util.Random;
import java.util.Scanner;

public class 方法允许返回引用类型 {
    public static void main(String[] args) {
        // String/Random/Scanner

    }

    public static String method1() {
        return "hello" + 18;
    }

    public static Scanner method2() {
//        Scanner sca = new Scanner(System.in);
//
//        return sca;

        return new Scanner(System.in);
    }

    public static Random method3() {
        return new Random();
    }
}
