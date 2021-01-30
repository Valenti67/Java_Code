package date_time;

// 既有年月日，又有时分秒
public class MyDateTime {
//    private int year;
//    private int month;
//    private int day;
    private MyDate date;

//    private int hour;
//    private int minute;
//    private int second;
    private MyTime time;

    public MyDateTime(MyDateTime datetime) {
//        this.date = datetime.date;     // TODO: BUG fix
//        this.time = datetime.time;     // TODO: BUG fix
        // date/time 不是基本类型，是引用类型，牵扯背后的对象
        // 所以，= 赋值，只复制了引用，没有复制对象
        // 所以就产生问题
        this.date = new MyDate(datetime.date);
        this.time = new MyTime(datetime.time);
    }

    public MyDateTime(int year, int month, int day, int hour, int minute, int second) {
        this.date = new MyDate(year, month, day);
        this.time = new MyTime(hour, minute, second);
    }

    // 部分构造，只传年月日，时分秒默认设置成 0时0分0秒
    public MyDateTime(int year, int month, int day) {
        this(year, month, day, 0, 0, 0);
    }

    public MyDateTime(MyDate date) {
//        this.date = date;   // TODO: BUG fix
        this.date = new MyDate(date);
        this.time = new MyTime(0, 0, 0);
    }

    //  向后走一秒
    public void next() {
        if (time.next()) {
            date.next();
        }
    }

    // 向前走一秒
    public void previous() {
        if (time.previous()) {
            date.previous();
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s", date, time);
    }
}
