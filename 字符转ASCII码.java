import java.util.Scanner;

/**
 * @ClassName 字符转ASCII码
 * @Deacription
 * @Date 2021/1/12 12:06
 **/
public class 字符转ASCII码 {
    public static void main(String[] args) {
        Scanner  scanner  = new Scanner(System.in);
        String word = scanner.next();
        char ch  = word.charAt(0);
        System.out.println((int)ch);
    }
}
