public class 演示栈的代码 {
    public static void a() {
    }

    public static void b() {
        a();
    }

    public static void c() {
        b();
    }

    public static void d() {
        c();
    }

    public static void main(String[] args) {
        d();
    }
}
