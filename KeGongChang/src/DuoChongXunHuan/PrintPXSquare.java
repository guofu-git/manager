package DuoChongXunHuan;
//输出平行四边形*
public class PrintPXSquare {
    public static void main(String[] args) {
        //输出一行空格+星星
        for (int i=1;i<=5;i++){

            //输出每行的空格
            for (int j=1; j<=5-i; j++){
                System.out.print(" ");
            }

            //输出每列星星
            for (int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
