package XunHuan;

import java.util.Scanner;

//如果成绩大于90分且音乐成绩大于80，（或者java=100 音乐>70）奖励Iphone
public class GetPrice02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);  //Scanner作为键盘输入的入口，仅需要开启一次
        System.out.println("请输入java成绩：");
        double score1 = input.nextDouble();
        System.out.println("请输入音乐成绩：");
        double score2 = input.nextDouble();

        if ((score1 > 90 && score2 >80)||(score1 == 100 && score2 > 70)){
            System.out.println("奖励一部Iphone！");
        }
    }
}
