public class 例1 {
    public static long factorial(int n) {
        // n > 0
        long ans = 1;

        for (int i = n; i >= 1; i--) {
            ans = ans * i;
        }

        return ans;
    }

    public static void main(String[] args) {
        long s = 0;
        for (int i = 1; i <= 5; i++) {
            s = s + factorial(i);
        }
        System.out.println(s);
    }
}
