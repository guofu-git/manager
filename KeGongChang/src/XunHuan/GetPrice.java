package XunHuan;

import java.util.Scanner;

//如果成绩大于90分，奖励Iphone
public class GetPrice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入成绩：");
        double score = input.nextDouble();
        if (score > 90){
            System.out.println("奖励一部Iphone！");
        }
    }
}
