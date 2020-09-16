package DuoChongXunHuan;
//1-10之内的整数相加，得到累加和>20的当前数
public class BreakDemo {
    public static void main(String[] args) {
        int sum = 0;
        int i ;
        for (i=1; i<=10; i++){
            sum = sum + i;
            if (sum>20){
                break;
            }
        }
        System.out.println("1-10之内的整数相加，得到累加和>20的当前数是："+i);
    }
}
