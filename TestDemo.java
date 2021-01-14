/**
 * @ClassName TestDemo
 * @Deacription  方法
 * @Date 2021/1/14 11:12
 *   一 方法（组织单位）
 *   1.为了抽象出更高层次的动作
 *   2.提高代码的复用率
 *   二 Java中的方法是什么？
 *   1.语句的组织代码
 *   2.某个对象相关联的动作集合
 *   三 Java中方法的阶段
 *   1.定义阶段
 *   2.使用阶段-方法的调用/方法的运行

 **/
public class TestDemo {
    public  static int pow(int n , int m){
        int i = 1;
        for (int j = 0; j <m ; j++) {
            i = i*n ;
        }
        return i ;
    }
    public static boolean isNarcissisticNumber(int n) {
                  int k = n ;
                  int ret = 0 ;
                  while ( n!=0){
                    int d = n%10;
                    n = n/10 ;
                   ret += pow(d,3);
                  }
                  return  ret ==k ;

    }

    public static void main(String[] args) {
        for (int i = 100; i <=999 ; i++) {
            if (isNarcissisticNumber(i)){
                System.out.println(i);
            }
        }

    }
}
