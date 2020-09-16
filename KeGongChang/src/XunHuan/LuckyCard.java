package XunHuan;

import java.util.Scanner;
//例子：利用random（）产生随机数，进行嵌套if选择，判断会员是否中奖
public class LuckyCard {
    public static void main(String[] args){
        System.out.println("请输入4位会员卡号：");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("会员卡号是："+num);

        //取百位数字
        int BaiWei = num/100%10;
        System.out.println("会员的百位数字为："+BaiWei);

        //判断用户是否中奖:会员卡百位数=系统随机生成的随机数  random 是 0.0<random<1.0
        int random = (int)(Math.random()*10);
        //System.out.println("随机数为："+random);

        //随机数与百位数字进行判断
        if (BaiWei == random){
            System.out.println("恭喜！获得精品礼品一份");
        }else {
            System.out.println("会员"+num+"，感谢您的参与！");
        }


    }
}