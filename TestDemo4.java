import java.util.Scanner;

/**
 * @ClassName TestDemo4
 * @Deacription 水仙花数
 * @Date 2021/1/13 15:42
 **/
public class TestDemo4 {
    public static void main(String[] args) {
        for (int i =100; i <=999 ; i++) {
            int n = i ;
            int sum = 0 ;
            while (  n!=0 ){
                int d = n %10 ;
                n=n/10;
                sum += (d*d*d);
            }
            if (  sum == i){
                System.out.println(i+"是水仙花数");
            }
        }
        }
    }



