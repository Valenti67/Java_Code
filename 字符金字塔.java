import java.util.Scanner;

/**
 * @ClassName 字符金字塔
 * @Deacription  输入一个字符，用它构造一个三角形金字塔
 * @Date 2021/1/11 19:00
 **/
public class 字符金字塔 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count =0 ;
        while (count<5 ){
            for (int i = 0; i <4-count; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i <count+1 ; i++) {
                System.out.print(s+" ");
            }
            System.out.println();
           count++;
        }
        }


    }



