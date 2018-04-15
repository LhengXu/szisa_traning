/**      猜数字是已一个古老的游戏，由一个出题者随机出一个数字，
        由猜题者猜，若所猜数字大于所出数字，则出题者回答『大了』；若小于，
        则回答『小了』；直到猜题者猜中。
         现在请编写程序模拟出题者，随机数字在0~1000之间。当使用者猜
        中时，同时打印出猜测次数。
 *
 */
import java.lang.*;
import java.util.Scanner;
public class Random {
    public static void main(String[] args) {
        int ret = 1;
        int answer = (int) (Math.random() * 1000);
        System.out.print("请输入您猜的数字：");
        Scanner str = new Scanner(System.in);
        int num = str.nextInt();
       while (answer != num) {
            if (answer > num) {
                System.out.print("您输入的数字小了，请重新输入:");
                str = new Scanner(System.in);
                num = str.nextInt();
                ret += 1;
            }
            if (answer < num) {
                System.out.print("您输入的数字大了，请重新输入:");
                str = new Scanner(System.in);
                num = str.nextInt();
                ret += 1;
            }
        }
           System.out.printf("恭喜您猜对了，正确答案是%d,您一共猜了%d次",answer,ret)；
    }
}
