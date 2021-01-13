/**
 * @ClassName 闰年
 * @Deacription 输出1000- 2000之间的闰年
 * @Date 2021/1/13 12:15
 **/
public class 闰年 {
    public static void main(String[] args) {
        for (int i = 1000; i <2000 ; i++) {
            if( ( (i%4==0)&&(i%100!=0))||i%400==0){
                System.out.println(i);
            }
        }
    }
}
