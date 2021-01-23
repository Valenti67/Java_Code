import java.util.Arrays;

public class 观察引用和对象 {
    public static void main(String[] args) {
        long[][] a = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        // 把 a 整体打印下
        /*
        =================
        [1, 2, 3, 4]
        [5, 6, 7, 8]
        [9, 10, 11, 12]
        [13, 14, 15, 16]
        =================
         */
        print二维数组(a);

        long[] t = a[2];
        a[2] = a[3];
        a[3] = t;

        System.out.println(Arrays.toString(t));
        // 把 a 整体打印下
        print二维数组(a);
    }

    public static void main6(String[] args) {
        long[][] a = {
                {1, 2, 3}, null, null, {4, 5, 6}
        };
        print二维数组(a);
    }

    private static void print二维数组(long[][] a) {
        // 方案 1：老老实实，从头写
//        if (a == null) {
//            System.out.println("null");
//            return;
//        }
//        System.out.println("[");
//        for (int i = 0; i < a.length; i++) {
//            System.out.print("    ");
//            if (a[i] == null) {
//                System.out.println("null");
//                continue;
//            }
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.printf("%d", a[i][j]);
//                if (j != a[i].length - 1) {
//                    System.out.printf(", ");
//                }
//            }
//            System.out.printf("\n");
//        }
//        System.out.println("]");

        // 方法2：借助已经学过的方法
//        if (a == null) {
//            System.out.println("null");
//            return;
//        }
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(Arrays.toString(a[i]));
//        }

        // 方法3：Arrays.deepToString
        System.out.println(Arrays.deepToString(a));
    }


    public static void main4(String[] args) {
//        long[][] a = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };

        long[][] a = {
                { 1 },
                null,
                { 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9, 10 },
                { 11, 12 },
                { 13 },
                { 14, 15, 16, 17 }
        };

        // 并不要求 a[0].length == a[1].length == a[2].length
    }


    public static void main3(String[] args) {
        long[][] a = new long[5][];
        // 如果想让 a[0][0] = 10 成立
        // 需要，至少让 a[0] 引用指向一个 元素是 long 的数组对象

        a[0] = new long[3];

        System.out.println(a[0][0]);    // 0
        a[0][0] = 10;
        System.out.println(a[0][0]);    // 10

        a[1] = new long[10];        // a[0] 的长度是 3，a[1] 的长度是 10，是否允许？ —— 允许
        a[1][0] = 100;
    }



    public static void main2(String[] args) {
//        long[] a = { 1, 2, 3, 4, 5 };
//
//        long[] b = Arrays.copyOf(a, a.length);
//
//        System.out.println(a == b);     // false
//
//        a[0] = 100;
//        System.out.println(b[0]);       // 1

        // 上面是复制 vs 下面的只是引用操作而已

        long[] a = { 1, 2, 3, 4, 5 };
        long[] b = a;

        System.out.println(a == b);     // true
        a[0] = 100;
        System.out.println(b[0]);       // 100
    }



    public static void main1(String[] args) {
        long[][] a = new long[5][];
        //a[0][1] = 10;
        long[] e = a[0];        // a != null，所以解引用没有问题
        System.out.println(e);  // null
        e[0] = 10;              // e == null，对 null 引用做解引用操作了，NPE
    }
}
