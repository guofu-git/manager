package XunHuan;

import java.util.Scanner;

//switch选择结构  例子：根据名次，判断计算机编程大赛的结果
public class Compete {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入比赛名次：");
        int mingCi = input.nextInt();
        switch (mingCi){
            case 1:  //意思：名次是不是1   mingCi==1；
                System.out.println("参加夏令营");
                break;
            case 2:
                System.out.println("奖励hp电脑");
                break;
            case 3:
                System.out.println("奖励500");
                break;
            default:
                System.out.println("没奖励");
        }
    }
}
