package ShuZu;
import java.util.Scanner;
//利用数组，求出五个人的平均成绩
public class GetAvg02 {
    public static void main(String[] args) {
        double[] scores = new double[5];
        double sum = 0;
        double avg = 0;
        Scanner input = new Scanner(System.in);
        //为数组元素赋值
        //通过传统的for循环来遍历数组的下标   下标范围：0----数组长度-1
        for (int i = 0; i <= scores.length-1; i++) {
            System.out.print("请输入第" + (i + 1) + "个学生的成绩：");
            scores[i] = input.nextDouble();
        }
        //使用增强型for（foreach）：迭代、为数组元素操作
        for (double score:scores){
            sum+=score;
        }

        avg = sum / scores.length;
        System.out.print("学生的平均成绩为：" + avg);
    }
}

        /*int[] scores = {10, 20, 30, 40, 50};
        int avg;
        avg =(scores[0]+scores[1]+scores[2]+scores[3]+scores[4])/5;
        System.out.println(avg);*/

