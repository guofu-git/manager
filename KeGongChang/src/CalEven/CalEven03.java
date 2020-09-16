package CalEven;
//用for（）循环 求100以内的偶数和
public class CalEven03 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        for (num=2;num<=100;num+=2){
            sum =sum + num;
        }
        System.out.println("3：100以为的偶数和为："+sum);
    }
}
