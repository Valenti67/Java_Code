public class Teacher {

    // 和方法定义在哪里无关
    public String init() {
        System.out.println("我是定义时初始化");
        return "";
    }

    // 和构造方法定义在哪里无关，永远最后执行
    public Teacher() {
        System.out.println("构造方法，永远最后执行");
        name = "陈沛鑫";
    }

    // 第一类：构造代码块
    {
        System.out.println("我是构造代码块中初始化");
    }

    // 第一类：定义时初始化
    public String name = init();

    // 第一类的执行顺序，按照类中的书写顺序


    // 重写继承自 Object 的 toString 方法
    public String toString() {
        return "Teacher{name=" + name + "}";
    }
}
