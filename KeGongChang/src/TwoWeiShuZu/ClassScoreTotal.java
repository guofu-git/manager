package TwoWeiShuZu;

import java.util.Scanner;

//二维数组： 有2个班的五位同学的成绩，求2个班各自的总成绩
public class ClassScoreTotal {
    public static void main(String[] args) {
        int[][] scores = new int[2][5];  //2个班   每个班5个学生
        Scanner input = new Scanner(System.in);
        //为成绩赋值   、   班级为外层循环   、   每个班的学生为内层循环
        for (int i=0; i<scores.length; i++) {
            System.out.println("-------第" + (i + 1) + "个班-----");
            for (int j = 0; j < scores[i].length; j++){
                System.out.print("第"+(i+1)+"个班的第"+(j+1)+"个学生的成绩为：");
                scores[i][j] = input.nextInt();
            }
        }
        //完成五个班级的成绩统计
        System.out.println("--------------统计成绩-----------------");
        for (int i=0; i<scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++){
                sum += scores[i][j];
            }
            System.out.println("第"+(i+1)+"个班的总成绩为："+sum);
        }

    }
}
