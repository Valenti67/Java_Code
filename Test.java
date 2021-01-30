package date_time;

import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyDateTime dt1 = new MyDateTime(2021, 12, 31, 23, 59, 53);
        MyDateTime dt2 = new MyDateTime(dt1);

        System.out.println(dt1);    //2021-12-31 23:59:53
        System.out.println(dt2);    //2021-12-31 23:59:53

        dt1.next();
        dt1.next();
        dt1.next();

        System.out.println(dt1);    // 2021-12-31 23:59:56
        System.out.println(dt2);    // 2021-12-31 23:59:53


//        while (true) {
//            System.out.println(datetime);
//            datetime.next();
//            TimeUnit.SECONDS.sleep(1);  // 让代码停顿 1 秒
//        }
    }
}
