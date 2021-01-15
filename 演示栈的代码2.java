public class 演示栈的代码2 {
    public static void a(int n) {
        if (n == 0) {
            return;
        }

        a(n - 1);
    }

    public static void main(String[] args) {
        a(10);
    }
}
