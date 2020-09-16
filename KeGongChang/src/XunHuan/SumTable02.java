package XunHuan;

import java.util.Scanner;

//复习加法表
public class SumTable02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个值：");
        int num = input.nextInt();
        System.out.println("根据这个值可以输出以下加法表：");
        for(int i=0,j=num; i<=num; i++,j--){
            System.out.println(i+"+"+j+"="+(i+j));
        }

    }
}
