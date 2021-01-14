public class 定义方法的语法 {
    // 两个 int 进行相加
    // 返回结果
    // 方法名最好是动词，除了首个单词之外，其余单词的首字母大写
    public static int add(int x,int y) {
        int r = x + y;

        return r;   // 返回值的类型 必须 和 int 之间有转换的关系
    }

    // 定义一个方法，计算 n（int） 的 m（int） m >= 0 次方，结果是 long 类型
    // 次方: pow
    public static long pow(int n, int m) {
        long ans = 1;
        for (int i = 0; i < m; i++) {
            ans = ans * n;
        }
        return ans;
    }

    // 给一个 n，判断 n 是不是水仙花数
    // int n
    // 返回值类型是 boolean
    // isNarcissisticNumber
    // 计算 3 次方的时候，直接使用 pow 方法
    public static boolean isNarcissisticNumber(int n) {
        int o = n;
        int sum = 0;

        while (n != 0) {
            int d = n % 10;
            n = n / 10;

            sum += pow(d, 3);
        }
        return sum == o;
    }

    public static void main(String[] args) {
        for (int n = 100; n <= 999; n++) {
            if (isNarcissisticNumber(n)) {
                System.out.println(n);
            }
        }
    }
}
