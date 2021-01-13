import java.util.Scanner;

/**
 * @ClassName 最大公约数
 * @Deacription
 * @Date 2021/1/13 13:24
 **/
public class 最大公约数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        while (true){
            if (m<n){
                int tmp = m;
                m = n ;
                n = tmp;
            }
            int r = m%n ;
            if (r ==0){
                break;
            }
            m = n;
            n = r;

        }
        System.out.println(n);
    }



}
