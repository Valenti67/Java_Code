import java.util.Scanner;

/**
 * @ClassName HomeWork
 * @Deacription   HomeWork
 * @Date 2021/1/12 22:55
 **/
public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        while (scanner.hasNextInt()){
            if (age<=18){
                System.out.println("少年");
            }else if (age<=28){
                System.out.println("青年");
            }else  if (age<=55){
                System.out.println("中年");
            }else {
                System.out.println("老年");
            }
        }

    }
}
