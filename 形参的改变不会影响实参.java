import java.util.Arrays;

// 无论是基本类型还是引用类型！
public class 形参的改变不会影响实参 {
    public static void main(String[] args) {
        long[] a = { 1, 2, 3, 4 };

        swap(a, 0, 3);

        System.out.println(Arrays.toString(a)); // [ 4  2  3  1  ]
    }

    private static void swap(long[] array, int indexA, int indexB) {
        long t = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = t;
    }

//    public static void main(String[] args) {
//        long[] a = { 1, 2, 3, 4 };
//        long[] b = { 100, 200, 300, 400 };
//
//        {
//            long[] x = a;
//            long[] y = b;
//
//            long[] t = x;
//            x = y;
//            y = t;
//        }
//
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));
//    }

//    public static void main(String[] args) {
//        long[] a = { 1, 2, 3, 4 };
//        long[] b = { 100, 200, 300, 400 };
//
//        swap(a, b);
//
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));
//    }
//
//    private static void swap(long[] x, long[] y) {
//        long[] t = x;
//        x = y;
//        y = t;
//    }

//    public static void main(String[] args) {
//        long a = 10;
//        long b = 20;
//        {
//            long x = a;
//            long y = b;
//
//            long t = x;
//            x = y;
//            y = t;
//        }
//
//        System.out.println(a);
//        System.out.println(b);
//    }

//    public static void main(String[] args) {
//        long a = 10;
//        long b = 20;
//
//        swap(a, b);
//
//        System.out.println(a);
//        System.out.println(b);
//    }
//
//    private static void swap(long x, long y) {
//        long t = x;
//        x = y;
//        y = t;
//    }
}
