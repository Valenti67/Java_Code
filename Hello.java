public class Hello {
    static {
        System.out.println("Hello 类被加载");
    }

    // 执行了 Hello 类下的 main 这个静态方法了
    // 用到 Hello 类了
    // 如果之前没有加载过 Hello 类，就进行 Hello 类的加载
    public static void main(String[] args) {
        System.out.println("Hello");

        new Hello();
    }
}
