package XunHuan;

import java.util.Scanner;

//判断一个数字是不是偶数
public class IsEven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int number = input.nextInt();
        String result = (number%2 == 0) ? "偶数" : "奇数";
        System.out.println(number+"是"+result);
    }
}
