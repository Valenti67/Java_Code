/**
 * @ClassName 乘法表
 * @Deacription
 * @Date 2021/1/13 12:48
 **/
public class 乘法表 {
    public static void main(String[] args) {
        for (int i = 1; i < 10 ;i ++){
            for (int j = 1; j <i+1 ; j++) {
                System.out.printf("%dx%d=%2d  ",j,i,j*i);
            }
            System.out.println();
        }
    }


}
