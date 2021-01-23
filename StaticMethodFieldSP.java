public class StaticMethodFieldSP {
    public static int a = 0;

    public static void staticMethod() {}

    public static void main(String[] args) {
        // 在同一个类中，可以省略类名
        System.out.println(a);
        staticMethod();

        // 完整的写法：类名.名称
        System.out.println(StaticMethodFieldSP.a);
        StaticMethodFieldSP.staticMethod();

        // 特殊用法，写起来，可以通过引用去调用
        StaticMethodFieldSP obj = new StaticMethodFieldSP();
        System.out.println(obj.a);
        obj.staticMethod();

        // 所以，即使，引用 == null，也可以正常使用，不会出现 NPE
        StaticMethodFieldSP obj2 = null;
        System.out.println(obj2.a);
        obj2.staticMethod();
    }
}
