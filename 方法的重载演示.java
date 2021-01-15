public class 方法的重载演示 {
    // 重载 = 方法名相同 && 方法签名不同
    public static int add(int a, int b) { return 0; }
    public static int add(int a, int b, int c) { return 0; }
    public static double add(double a, double b) { return 0; }

    //public static double add(int a, int b) { return 0; } 返回值类型不在方法签名中
}
