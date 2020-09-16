package ShuZu;

import java.util.Scanner;

//在已知降序的数组中的正确位置插入一个特定的数字
public class InsertNum {
    public static void main(String[] args) {
        //数值长度一旦固定就无法修改，因此直接设置为6个数组元素。
        int[] list = new int[6];
        list[0] = 99;
        list[1] = 85;
        list[2] = 82;
        list[3] = 63;
        list[4] = 60;

        //1、获取用户要插入的数值
        Scanner input = new Scanner(System.in);
        System.out.print("请输入您要插入的数值：");
        int num = input.nextInt();
        //找到num要插入的位置index：找到num里，（第一个）数组元素，比num大的，那个位置就是index的位置
        //int index = 0;  当插入的数字比所有的数组元素都小的时候，index永远是0是错误的！
        //当插入的值是负值，应该放在最后面（因为是降序排列），即是list.length-1
        int index = list.length-1;
        for (int i=0; i<=list.length-1; i++){
            if (num > list[i]){
                index = i;
                break;
            }
        }
        //2、原来的index位置及以后的所有数据，都需要往后移动一位
        for (int i=list.length-1; i>index; i--){
            list[i] = list[i-1];    //当list.length-1 = 5时， list[5] = list[4]以此类推
        }
        //3、在index的位置，将num插入
        list[index] = num ;
        System.out.println("插入成绩的下标是："+index);
        System.out.println("插入数值后的最后成绩是：");
        for (int listNum:list){
            System.out.print(listNum+"\t");
        }
    }
}
