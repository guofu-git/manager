package DuoChongXunHuan;
import java.util.Scanner;

//输出等腰数字三角形
public class PrintTriangleNums {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("您想要几行数字？");
        int num = input.nextInt();

        //输出一行空格+数字
        for (int i=1;i<=num;i++){

            //输出每行里面的空格  行i  空格数num-i
            for (int j=1; j<=num-i; j++){
                System.out.print(" ");
            }

            //输出多少列数字？ 2*i-1
            for (int j=1; j<=(2*i-1); j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
