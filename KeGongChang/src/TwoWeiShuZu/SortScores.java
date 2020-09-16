package TwoWeiShuZu;

import java.util.Scanner;

// 冒泡排序（降序）
public class SortScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入五位同学的成绩：");
        int[] list = new int[5];
        for (int i=0; i<5; i++){
            System.out.print("请输入第"+(i+1)+"位学生的成绩:");
            list[i] = input.nextInt();
        }
       //冒泡排序：降序
        for (int i=0; i<list.length-1; i++){
            for (int j=0; j<list.length-1-i; j++){
                if (list[j] < list[j+1]) {
                    int temp = list[j];
                    list[j] = list[j+ 1];
                    list[j + 1] = temp;
                }
            }
        }

        //输出
        for (int nums:list){
            System.out.println(nums);
        }


    }
}
