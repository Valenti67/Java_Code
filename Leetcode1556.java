public class Leetcode1556 {
    public static String thousandSeparator(int n) {
        if (n == 0) {
            return "0";
        }
        String ans = "";

        int count = 1;
        while (n > 0) {
            int d = n % 1000;

            String sd = String.valueOf(d);
            if (n >= 1000 && sd.length() < 3) {
                if (sd.length() == 0) {
                    sd = "000";
                } else if (sd.length() == 1) {
                    sd = "00" + sd;
                } else {
                    sd = "0" + sd;
                }
            }
            if (count == 1) {
                ans = sd;
            } else {
                ans = sd + "." + ans;
            }

            n = n / 1000;

            count++;
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = thousandSeparator(51040);
        System.out.println(s);
        // "123.456.789"
    }
}
