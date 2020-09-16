package ShuZu;
//复习 ：在已知降序的5位数数组中，特定位置插入特定的值
import java.util.Scanner;

public class InsertNumRe {
    public static void main(String[] args) {
        //声明数组list并赋值
        int[] list = new int[6];
        list[0] = 99;
        list[1] = 85;
        list[2] = 73;
        list[3] = 66;
        list[4] = 55;
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个数值：");
        int num = input.nextInt();
        //1、找到index的位置
        int index = list.length-1;
        for (int i =0; i<= list.length-1; i++){
            if (num > list[i]){
                index = i;
                break;
            }
        }
        //2、所有元素后移动一位
        for (int i=list.length-1; i>index; i--){
            list[i] = list[i-1];
        }
        //3、在index的位置，插入数值num
        list[index] = num;
        System.out.println("插入数值的下标为："+index);
        System.out.println("插入数值后的最后成绩是：");
        for (int listNum :list){
            System.out.print(listNum+"\t");
        }
    }
}
