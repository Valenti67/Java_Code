public class TeacherTest {
    public static void main(String[] args) {
        Teacher a = new Teacher();

        // 这两个操作是等价的
        // System.out.println(引用) => System.out.println(引用.toString())
        System.out.println(a);
        // System.out.printf("%s", 引用) => System.out.printf("%s", 引用.toString())
        System.out.printf("%s\n", a);

        String s = a.toString();
        System.out.println(s);
        System.out.printf("%s\n", s);
    }
}
