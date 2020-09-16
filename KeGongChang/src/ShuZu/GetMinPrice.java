package ShuZu;
//数组+循环   求4家手机店的最低手机价格
import java.util.Scanner;

public class GetMinPrice {
    public static void main(String[] args) {
        //4部手机价格的声明与赋值
        double[] prices = new double[4];
        Scanner input = new Scanner(System.in);
        for (int i=0; i<=prices.length-1; i++){
            System.out.print("请输入第"+(i+1)+"家手机的最低价格：");
            prices[i] = input.nextInt();
        }

        //判断数组元素的最小值
        double min = prices[0];
        for (int i=1; i<=prices.length-1; i++){
            if (prices[i] < min){
                min = prices[i];
            }
        }
        System.out.println("手机价格最低的是："+min+"元");
    }
}
