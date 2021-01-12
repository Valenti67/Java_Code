import java.util.Scanner;

/**
 * @ClassName 输出学生信息
 * @Deacription
 * @Date 2021/1/12 11:17
 **/
public class 输出学生信息 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int age = scanner.nextInt();
        String gender = scanner.next();

        System.out.println("Name    Age    Gender");
        for (int i = 0; i <21 ; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("%-8s",name); //  -  左对齐
        System.out.printf("%-7d",age);
        System.out.printf("%s",gender);




    }
}
