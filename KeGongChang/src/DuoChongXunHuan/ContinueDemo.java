package DuoChongXunHuan;
//统计80分以上的学生比例(不用continue)
import java.util.Scanner;

public class ContinueDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入班级总人数：");
        int total = input.nextInt();
        int score =0;
        //统计>80分的人数
        int num = 0;

        //循环录入每个人的成绩
        for (int i=1; i<=total; i++){
            System.out.print("请录入第"+i+"个同学的成绩：");
            score = input.nextInt();
            if (score>=80){
                num++;
            }
        }
        //计算>=80的比例
        System.out.println("80分以上的学生人数为："+num);
        double biLi = (double) num/total*100;
        System.out.println("80分以上的学生所占的比例："+biLi+"%");
    }
}
