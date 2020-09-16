package CalEven;
//用do while（）循环 求100以内的偶数和
public class CalEven02 {
    public static void main(String[] args) {
        int num = 2;
        int sum = 0;

        do {
            sum =sum + num;
            num += 2;
        }while(num<=100);

        System.out.println("2：100以为的偶数和为："+sum);
    }
}
