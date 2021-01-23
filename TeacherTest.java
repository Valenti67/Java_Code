public class TeacherTest {
    public static void main(String[] args) {
        // 针对 Teacher 作为对象模板的用法
        Teacher a = new Teacher("AAA", 1);
        a.introduce();  // 通过指向 Teacher 对象的引用去调用

        // 针对 Teacher 用户静态的集合
        // 使用类名调用，和对象无关
        int b = Teacher.countOfTeacher;
        System.out.println(b);                  // 0
        System.out.println(Teacher.buildTeacher("Hello"));  // "Hello"
        System.out.println(Teacher.countOfTeacher); // 1
        System.out.println(Teacher.getCountOfTeacher());    // 1
        System.out.println(Teacher.buildTeacher("world"));  // "world"
        System.out.println(Teacher.countOfTeacher); // 2
        System.out.println(Teacher.getCountOfTeacher());    // 2
    }
}
