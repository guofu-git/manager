package XunHuan;

import java.util.Scanner;
//do while()  例子：先编写程序、判断是否合格，若合格，则退出；不合格，则继续编程。
public class DoWhileDemo {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        String answer ;

        do {
            System.out.println("上机编写程序。");

            System.out.print("合格了吗？(Y/N)");
            answer = input.next();
        }while (answer.equals("N"));

        System.out.print("合格了!恭喜您通过考核！");
    }
}
