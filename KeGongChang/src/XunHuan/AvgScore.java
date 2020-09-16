package XunHuan;

import java.util.Scanner;

//for() 计算学生的平均分
public class AvgScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入学生的姓名：");
        String name = input.next();
        double score = 0;
        double sum = 0;

        //循环
        for (int i=1;i<=5;i++){
            System.out.print("请输入5门功课中第"+i+"门课的成绩：");
            score = input.nextDouble(); //score：获取输入的成绩
            sum = sum + score;  //把每一门课的成绩进行累加
        }
        //平均分
        double avg = sum/5;
       System.out.print(name+"的平均分为："+avg);
    }
}
