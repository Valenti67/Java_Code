import java.util.Scanner;

/**
 * @ClassName TestDemo2
 * @Deacription 统计二进制中1的个数
 * @Date 2021/1/13 14:48
 *      n & (n-1)  =>  二进制中的1的个数会减1
 **/
public class TestDemo2 {
    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count1= 0 ;
        int count2= 0 ;
        int n = scanner.nextInt() ;
        for (int i = 0; i <32 ;i += 2) {
            if (( n & (1<<i)) != 0 ){
                count2++;
            }
        }
        for (int i = 1; i <32 ; i += 2 ) {
            if (( n & (1<<i)) != 0 ){
                count1++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
    }


    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0 ;
        int n = scanner.nextInt() ;
        while (n !=0 ){
            n= n & (n-1);
            count++;
        }
        System.out.println(count);
    }



    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0 ;
        int n = scanner.nextInt() ;
        for (int i = 0; i <32 ; i++) {
             if (( n & (1<<i)) != 0 ){
                 count++;
             }
        }
        System.out.println(count);
    }


}
