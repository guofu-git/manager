package ShuZu;

import java.util.Scanner;

//计算张浩班级5人的Java平均分
public class GetAvg {
    public static void main(String[] args) {
        double[] scores03 = new double[30];

        int i=0 ;             //i：第几个学生
        double sum = 0;       //sum：学生的成绩之和

        Scanner input = new Scanner(System.in);

        for (;i<5;i++){
            System.out.print("请输入第"+(i+1)+"个学生的成绩：");
            scores03[i] = input.nextDouble();
            sum = sum +scores03[i];
        }
        double avg = sum/5;  //avg：学生的平均分
        System.out.println("该班学生的JAVA平均分为："+avg);
       // int[] scores = new int[5];

        /*int[] scores01 = {10,20,30,40,50};   //写法一：数组元素较少的时候，可以边声明边赋值
        int[] scores02 = new int[]{10,20,30,40,50}; //写法二：int里面不能*/
    }
}
