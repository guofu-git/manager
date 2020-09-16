package DuoChongXunHuan;
//用双重循环 实现十年
public class TenYears {
    public static void main(String[] args) {
        //公转一次   一年
        for (int year=1;year<=10;year++){
            System.out.println("----------第"+year+"年--------");
            //自传一次   365天
            for (int day=1;day<=365;day++){
                System.out.println("第"+day+"天");
            }
        }
    }
}
