package ShuZu;

import java.util.Scanner;

//输出购物金额
public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入会员本月的消费记录");
        double[] list = new double[5];  //定义一个数组存储这5个数据

        for (int i=0; i<list.length; i++){
            System.out.print("请输入第"+(i+1)+"笔购物金额：");
            list[i] = input.nextDouble();   //list[i]依次给list赋值
        }

        //输出购物金额及总金额
        double sum = 0;
        System.out.println("序号\t\t金额（元）");
        for (int i=0; i<list.length; i++){
            System.out.println((i+1)+"\t\t\t"+list[i]);
            sum = sum + list[i];
        }
        System.out.println("总金额：\t\t"+sum);

    }
}
