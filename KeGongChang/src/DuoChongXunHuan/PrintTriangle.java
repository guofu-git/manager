package DuoChongXunHuan;
//输出等腰三角形
public class PrintTriangle {
    public static void main(String[] args) {
        //输出一行空格+星星
        for (int i=1;i<=5;i++){

            //输出每行的空格
            for (int j=1; j<=5-i; j++){
                System.out.print(" ");
            }

            //输出多少列星星？ 2*i-1
            for (int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
