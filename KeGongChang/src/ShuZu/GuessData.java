package ShuZu;

import java.util.Scanner;

//猜数游戏
public class GuessData {
    public static void main(String[] args) {
        int[] list = new int[]{8,4,2,1,23,344,12};   //定义数组并赋值
        int sum = 0;
        for (int num :list){
            System.out.println(num);
            sum += num;
        }
        System.out.println("数组之和为："+sum);

        //猜数
        Scanner input = new Scanner(System.in);
        System.out.print("请输入您猜测的数字：");
        int guess = input.nextInt(); //guess代表猜测是数字
        //isCorrect 代表猜测结果
        boolean isCorrect = false;
        for (int num:list){
            if (num == guess){
                isCorrect = true;
                break;
            }
        }
        if (isCorrect){
            System.out.println("恭喜您！猜测的数字在数列之内！");
        }else {
            System.out.println("对不起，您猜测的数字不在数列之内！");
        }
    }
}
