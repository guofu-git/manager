package DuoChongXunHuan;

public class PrintMulTable {
    public static void main(String[] args) {
        //乘数a（前面的） 作为外层；    被乘数b（后面的）  作为内层
        for (int a=1;a<=9;a++){
            for (int b=1;b<=a;b++){
                System.out.print(a+"*"+b+"="+(a+b)+"\t");
            }
            System.out.println();
        }
    }
}
