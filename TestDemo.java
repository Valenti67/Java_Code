/**
 * @ClassName TestDemo
 * @Deacription
 * @Date 2021/1/13 13:40
 **/
public class TestDemo {
    public static void main(String[] args) {
        double ret = 0.0 ;
        int  i = 1;
        while (i<101){
            double  item = 1.0/i ;
            if (i%2==0){
                ret -= item;
            }else {
                ret += item ;
            }
            i++;
        }
        System.out.println(ret);
        }

    }

