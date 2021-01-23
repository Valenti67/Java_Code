public class 使用Teacher类实例化对象 {
    public static void main(String[] args) {
        // 使用 Teacher 类，实例化对象
        // 一共实例化了 3 个对象出来
        Teacher a = new Teacher();
        Teacher b = new Teacher();
        Teacher c = new Teacher();

//        // 带有 new 的操作，就会实例化出一个新的对象出来
//        System.out.println(a == b);     // false
//        System.out.println(b == c);     // false
//
//        // 操作对象的属性的语法（读取/修改） —— 通过 . 解引用
//        System.out.println(a.name);
//        System.out.println(a.age);

        // 通过 . 解引用操作，修改对象的属性（通过引用）
        a.name = "hello";
        a.age = 18;
        System.out.println(a.name);
        System.out.println(a.age);


        System.out.println(b.name);
        System.out.println(b.age);
    }
}
