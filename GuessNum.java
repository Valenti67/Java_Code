import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName GuessNu
 * @Deacription  猜数字游戏
 * @Date 2021/1/11 18:05
 **/
public class GuessNum {
    public static void main(String[] args) {
        int bound = 0;
        int k = 0;
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入所选难度:(简单/普通/困难)");
        String s = scanner.nextLine();
        switch (s){
            case "简单":
                bound = 10;
                k=3;
                break;
            case "普通":
                bound = 100;
                k=7;
                break;
            case "困难":
                bound = 1000;
                k=10;
                break;
        }
        Random random  = new Random();
        int r = random.nextInt(bound);
        int count = 0;
        while (scanner.hasNextInt()&& count<k){
            int n = scanner.nextInt();
            if (n==r){
                System.out.println("猜正确");
                break;
            }else if (n<r){
                System.out.println("猜小了");
            }else {
                System.out.println("猜大了");
            }
             count++ ;
             }
        }



    }


