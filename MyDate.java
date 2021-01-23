public class MyDate {
    // 通过把属性设置成 private，并且写 public 的 get属性 方法
    // 使得，把读权限公开，但写权限不公开
    private int year;
    private int month;
    private int day;



    // 命名规范 —— get属性名 —— getter
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    // 命名规范 —— set属性名 —— setter
    public void setYear(int year) {
        if (year < 1900 || year > 3000) {
            // 完全就是一个实例化对象的代码
            RuntimeException exception = new RuntimeException("year 参数错误");
            // 通过 throw 关键字，抛出了一个异常对象
            throw exception;
        }

        this.year = year;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new RuntimeException("month 参数错误");
        }

        this.month = month;
    }

    public void setDay(int day) {
        if (day < 1 || day > MyDate.getMonthDay(year, month)) {
            throw new RuntimeException("day 参数错误");
        }

        this.day = day;
    }

    // 1. 必须得校验，传入参数的合法性
    //    year: 1900 <= year <= 3000
    //    month: 1 <= month <= 12
    //    day:   1 <= day <= 每个月的天数
    // 2. 如果不符合，应该怎么办 —— 由甲方和乙方共同协商出结果
    //    1. 抛异常，通知对方出错（我们选用这种）
    //    2. 尝试修复参数
    public MyDate(int year, int month, int day) {
        if (year < 1900 || year > 3000) {
            // 完全就是一个实例化对象的代码
            RuntimeException exception = new RuntimeException("year 参数错误");
            // 通过 throw 关键字，抛出了一个异常对象
            throw exception;
        }

        if (month < 1 || month > 12) {
            throw new RuntimeException("month 参数错误");
        }

        // 需要一个，可以根据 year, month，计算出该月共有多少天的方法
        if (day < 1 || day > MyDate.getMonthDay(year, month)) {
            throw new RuntimeException("day 参数错误");
        }

        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate(MyDate from) {
        this.year = from.year;
        this.month = from.month;
        this.day = from.day;
    }

    public static int getMonthDay(int year, int month) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                // 利用不加 break，代码会继续向下的规则
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return MyDate.isLeapYear(year) ? 29 : 28;
            default:
                // 肯定不会走到这里，但 Java 语法要求所有分支必须有返回值
                // 所以写出来
                return -1;
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    // @XXX 这种语法叫做 注解（Annotation）
    // 主要用来声明（Declare）一些方法/属性/类 具备的特征
    // Override 的意思是 重写/覆写
    // 所以 @Override 的意思就是单纯声明 toString 方法是一个重写方法
    // 注解没有执行含义（目前遇到的），主要是方便开发者一眼就看出哪些方法是重写方法，哪些不是
    @Override
    public String toString() {
        String s = String.format("%04d-%02d-%02d", this.year, this.month, this.day);
        return s;
    }

    // 参数合法性校验：this 代表的日期 必须大于 from 代表的日期
    public int 计算相差天数(MyDate from) {
        // this 指向的对象
        // 和
        // from 指向的对象
        // 之间相差的天数


        // 要求 this 大于 from
        // if (from >= this) {  // 引用无法使用 >= 运算符
        // 所以使用人为规定出的 compareTo 方法，进行日期的大小比较
        if (this.compareTo(from) <= 0) {   // compareTo(from) <- 没有歧义时，可以省略 this
            throw new RuntimeException("from 的日期必须在当前日期之前");
        }

        // 用 from 的复制计算，以免下面计算时，把别人传入的 from 对象修改掉
        MyDate fromCopy = new MyDate(from);
        //MyDate fromCopy = from;     // 只是让 fromCopy 指向 from 指向的对象了
                                    // 通过 fromCopy 修改对象，from 也感受的到 —— 引用的共享特性

        int count = 0;
        // while (from < this) {
        while (fromCopy.compareTo(this) < 0) {
            // 让 from 向后走一天
            // from.day++;     // 错误，没有考虑进位问题
            System.out.println(fromCopy);
            fromCopy.increment();

            count++;
        }

        return count;
    }

    public void increment() {
        day++;
        if (day <= MyDate.getMonthDay(year, month)) {
            // day 不需要考虑进位
            return;
        }

        // day 需要考虑日期进位
        month++;
        day = 1;

        if (month <= 12) {
            // month 不需要考虑进位
            return;
        }

        year++;
        month = 1;
    }

    // 定义一个比较方法 (this, other)
    // 规定，如果 this < from，返回任意负数
    //       如果 this == from，返回 0
    //       如果 this > from，返回任意正数
    public int compareTo(MyDate from) {
        // this 和 from 在进行比较

        if (year != from.year) {
//            if (year > from.year) {
//                return 1;
//            } else {
//                return -1;
//            }
            return year - from.year;    // year > from.year => 正数；否则 负数
        }

        // 说明 year == from.year
        if (month != from.month) {
            return month - from.month;
        }

        // 说明 year == from.year && month == from.month
        return day - from.day;
    }
}
