package XunHuan;

import java.util.Scanner;

//嵌套if选择结构
//根据比赛成绩，进行男女分组
public class RunningMatch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入百米赛跑成绩：（单位：秒）");
        double score = input.nextDouble();
        if (score <= 10){
            System.out.println("请输入性别：（男/女）");
            String sex = input.next();
            if (sex.equals("男")){
                System.out.println("进入男生组决赛！");
            }else if (sex.equals("女")){
                System.out.println("进入女生组决赛！");
            }else{
                System.out.println("性别输入不正确！");
            }
        }else return;
    }
}
