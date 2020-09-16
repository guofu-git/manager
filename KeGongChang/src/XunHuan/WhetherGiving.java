package XunHuan;

import java.util.Scanner;

//do while()  例子：先问乔利源乖不乖、判断是否乖，若乖，则退出；不乖，则打一顿。
public class WhetherGiving {
    public static void main(String [] args){
        String answer ;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("针对乔利源同志的批斗：");
            System.out.print("乔利源乖不乖啊？（Y/N）");
            answer = input.next();
           // System.out.println("一点也不乖");
        }while(answer.equals("N"));

        System.out.println("还不错，挺乖的嘞！");
    }
}
