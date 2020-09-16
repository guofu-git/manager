package DuoChongXunHuan;

import java.util.Scanner;

//break + continue
/* 从键盘输入一个数字，当输入1-7时，输出星期一---星期日
   输入其他数字时，提示用户重新输入 */
public class PrintWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("请输入1-7的数字（输入0则退出程序）：");
            num = input.nextInt();
            //判断用户录入的数字，是否在1-7
            if (num<0||num>7){
                System.out.println("您输入的数字不合理，请输入1-7的数字");
                continue;   //数字不合格，直接不执行switch，直接重新进入do
            }
            switch (num) {
                case 1:
                    System.out.println("星期一");
                    break;
                case 2:
                    System.out.println("星期二");
                    break;
                case 3:
                    System.out.println("星期三");
                    break;
                case 4:
                    System.out.println("星期四");
                    break;
                case 5:
                    System.out.println("星期五");
                    break;
                case 6:
                    System.out.println("星期六");
                    break;
                case 7:
                    System.out.println("星期日");
                    break;
            }
        }while (num!=0);
        System.out.println("谢谢使用！程序结束。");
    }
}
