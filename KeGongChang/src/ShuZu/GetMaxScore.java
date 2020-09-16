package ShuZu;
//求五位同学的JAVA最高分
import java.util.Scanner;

public class GetMaxScore {
    public static void main(String[] args) {
        //五个成绩声明与赋值
        int[] scores = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i=0; i<=scores.length-1; i++){
            System.out.print("请输入第"+(i+1)+"位学生的JAVA成绩为：");
            scores[i] = input.nextInt();
        }

        //判断成绩最大值
        int max = scores[0];
        for (int i=1; i<=scores.length-1; i++){
            if (scores[i]>max){
                max = scores[i];
            }
        }
        System.out.println("JAVA成绩最高的是："+max+"分");
    }
}
