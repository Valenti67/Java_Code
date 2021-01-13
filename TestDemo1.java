/**
 * @ClassName TestDemo1
 * @Deacription
 * @Date 2021/1/13 14:09
 **/
public class TestDemo1 {
    public static void main(String[] args) {
        int  i  = 999 ;
        while (i>0){
            int d = i%10 ;
            System.out.printf("%d ",d);
             i /= 10;
        }
    }


}
