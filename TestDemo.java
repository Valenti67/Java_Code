import java.util.Scanner;

/**
 * @ClassName TestDemo
 * @Deacription  表达式-逻辑结构一
 * @Date 2021/1/8 21:49
 *   a++   表达式的值为1  a的值为2
 *   ++a   表达式的值为2  a = 2
 *  & 按位与 二个二进位全为1时，结果位为1
 *  | 按位或  二个二进位有一个为1时，结果位就为1
 *  ~ 按位取反
 * ^ 异或  相同取0 相异取1
 *    p<<n  左移n位   ==   p*2^n
 *    java中，凡是条件部分都是布尔类型！
 *     //round 四舍五入  ceil 向上取整    floor 向下取整
 *    顺序结构
 *    分支结构： if    if else   if else if else
 *    循环结构  闰年 (( year%100!=0)&& year%4==0) || (year%400==0)
 *     while <=>  for      do {} while {}
 **/
public class TestDemo {
    public static void main(String[] args) {
        double a = 3.1415926 ;
        System.out.printf("%.3f\n",a);   //  .3  小数点后面四舍五入的取3位
        String s = "你好中国";
        System.out.printf("%-10s早上好\n",s); //  -10s 不对齐，并且占10个字符；

        Scanner scanner = new Scanner(System.in);
        String next = scanner.next(); //  按照 空格/回车/ \t 分割一个个的字符
        System.out.println(next);
        String s1 = scanner.nextLine();  // 按照 回车切割一句话
        int i =scanner.nextInt(); // 按照 空格/回车/ \t 分割一个个的字符
        while (scanner.hasNext()){
            String word = scanner.next();
            System.out.println(word);

        }

    }


}
