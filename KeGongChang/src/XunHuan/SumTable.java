package XunHuan;

import java.util.Scanner;

//for（）  输入一个数字，输出对应行数的加法表
public class SumTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个值：");
        int charecter = input.nextInt();
        System.out.println("根据这个值可以输出以下加法表：");

        for ( int i=0,j=charecter; i<=charecter; i++,j--){
            System.out.println(i+"+"+j+"="+(i+j));
        }
    }
}
