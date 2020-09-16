package XunHuan;

import java.util.Scanner;

//while（）练习  例子：每天检查学习任务是否合格，如果不合格 继续进行。
//                   如果合格 上午阅读教材 学习理论，下午上机编程 掌握代码部分
public class DailyWork {
    public static void main(String[] args){
        String answer ;
        Scanner input = new Scanner(System.in);
        System.out.print("合格了吗？(Y/N)");
        answer = input.next();

        while ("N".equals(answer)){
            System.out.println("上午阅读教材");
            System.out.println("下午上机实践");
            System.out.print("合格了吗？(Y/N)");
            answer = input.next();
        }
        System.out.print("合格了！");
    }
}
