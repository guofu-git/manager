package XunHuan;

import java.util.Scanner;

//根据成绩，进行不同的反馈
public class ScoreReply {
    public static void main(String[] args){
        //规则：>=80 良好 ； >=60 中等 ； <60 差
        Scanner input = new Scanner(System.in);
        System.out.println("请输入成绩：");
        double score = input.nextDouble();
        if(score >= 80 ){
            System.out.println("良好！");
        }
        //else if ((score >= 60)&&(score < 80))   else if本身就是满足第一步的if的对立面
        else if(score < 80){
            System.out.println("中等！");
        }else {
            System.out.println("差！");
        }
    }
}
