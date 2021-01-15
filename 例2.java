public class 例2 {
    public static int min(int a, int b) {
        return a <= b ? a : b;
    }

    public static void main(String[] args) {
        min(1, 3);

        例2.min(1, 3);
    }
}
