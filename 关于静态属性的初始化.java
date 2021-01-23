public class 关于静态属性的初始化 {
    // 按照代码的书写顺序执行

    // 静态代码块
    static {
        System.out.println("静态代码块");
    }

    public static int a = init();    // 定义时初始化

    public static int init() {
        System.out.println("定义时初始化");
        return 0;
    }

    public static void main(String[] args) {
    }
}
