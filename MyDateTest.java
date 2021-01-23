public class MyDateTest {
    public static void main(String[] args) {
        MyDate from = new MyDate(2024, 1, 1);

        MyDate to = new MyDate(2024, 3, 1);
//        System.out.println(to.compareTo(from));     // 正数  to > from
//        System.out.println(from.compareTo(to));     // 负数  from < to
//        System.out.println(to.compareTo(to));       // 0     to == to
//        System.out.println(from.compareTo(from));   // 0     from == from

        System.out.printf("从 %s 到 %s 经过了 %d 天\n",
                from, to, to.计算相差天数(from)
        );
    }
}
