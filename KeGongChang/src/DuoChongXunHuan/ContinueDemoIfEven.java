package DuoChongXunHuan;
//求1-100之内的偶数和  (利用 for+if)
public class ContinueDemoIfEven {
    public static void main(String[] args) {
        int sum = 0;  //偶数和

        for (int i=1; i<=10; i++){
            if (i%2==0){
                sum +=i;
            }
        }
        System.out.println("1-100之内的偶数和为："+sum);
    }
}
