public class MyDateTest {
    public static void main(String[] args) {
        MyDate a = new MyDate(2021, 1, 22);
        System.out.println(a);

        // 由于现在 MyDate 下的所有属性/方法都用 public 修饰
        // 所以，在 MyDateTest 类中，也可以正常的访问/修改 属性/方法
        // a.month = 13;   // <-- 符合语法规则
                        // 逻辑上出问题了
        //a.setMonth(13);
    }
}
