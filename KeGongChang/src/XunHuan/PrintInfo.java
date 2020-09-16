package XunHuan;

import java.util.Scanner;
    /*5.20日 ：
      复习5.19日所学的变量的命名与使用；
      常量的命名与使用；
      Scanner的意义与使用*/
public class PrintInfo{
    public static void main(String[] args){
        String name="郭芙";
        System.out.println("我的名字叫："+name);

        Scanner input = new Scanner(System.in);
        System.out.println("请输入您喜欢的专业：");
        String major = input.next();
        System.out.println(name+"，您喜欢的专业是："+major);

        final double PI = 3.0;
        Scanner input2 = new Scanner(System.in);
        System.out.println("请输入圆的半径："+"（单位：厘米）");
        double r =input2.nextDouble();
        double area = PI*r*r;
        System.out.println("圆的面积是："+area+"平方厘米");
    }
}