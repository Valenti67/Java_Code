import java.util.Scanner;

/**
 * @ClassName TestDemo3
 * @Deacription  猜密码
 * @Date 2021/1/13 15:29
 **/
public class TestDemo3 {
    public static void main(String[] args) {
        String password = "123" ;
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        boolean flag = false;
        while (count<3 && scanner.hasNext()){
            String next = scanner.next();
            if (next.equals(password)){
                flag = true;
                break;
            }
            count++;
        }
         if (count==3){
             System.out.println("三次机会已经用完");
         } else  if (flag){
             System.out.println("正确");
         }else  {
             System.out.println("");
         }

    }
}
