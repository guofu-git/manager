package DuoChongXunHuan;

import java.util.Scanner;

//计算学员的平均分，循环录入学员的成绩，输入负数则退出
public class CalAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入您的姓名：");
        String name = input.next();
        //总成绩
        int sum = 0;
        //违规操作的标签 boolean
        boolean flag = false;

        for (int i = 1; i <= 5; i++) {
            System.out.print("请输入第" + i + "门课的成绩：");
            int score = input.nextInt();
            if (score < 0) {
                flag = false;
                break;   //输入为负值，直接跳出循环
            }
            sum = sum + score;
        }

        //if(！flag)表示为flag为flase
        //if(flag)表示为默认flag为true     等价于if (flag == true)
        if (flag == true) {
            double avg = sum / 5;
            System.out.println(name + "的五门课平均成绩为：" + avg);
        } else {
            System.out.println("抱歉，分数输入有误，不再录入");
        }
    }
}
