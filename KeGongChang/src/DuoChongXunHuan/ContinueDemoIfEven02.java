package DuoChongXunHuan;
//求1-100之内的偶数和  (利用 for+if+continue)
public class ContinueDemoIfEven02 {
    public static void main(String[] args) {
        int sum = 0;  //偶数和

        for (int i=1; i<=10; i++){
            if (i%2!=0){
                continue;   //如果是奇数，就跳出，执行for
            }
            sum = sum + i;
        }
        System.out.println("1-100之内的偶数和为："+sum);
    }
}
