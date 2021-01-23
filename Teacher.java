public class Teacher {
    public String name;
    public int age;

    // 没有写构造方法
    // 如果类里，一个构造方法都没有写
    // 则 Java 隐含着补一个构造方法，无参 + 什么都不做

    // 什么都不写，等同于写了这个
//    public Teacher() {
//    }

    // 但是，一旦类里有构造方法了，无论长什么样，Java 不再补无参的构造方法了
    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 没有无参构造方法了

    public static void main(String[] args) {
        //Teacher a = new Teacher();      // 没有写构造方法，但我也可以构造出对象
        Teacher a = new Teacher("Hello", 18);
        System.out.println(a.name);     // 访问属性
        System.out.println(a.age);
    }
}
