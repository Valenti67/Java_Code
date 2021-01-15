import java.util.Scanner;

public class 之前见过的方法重载 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        sca.nextInt();
        sca.nextInt(16);

        Integer.parseInt("16");
        Integer.parseInt("16", 16);
    }
}
