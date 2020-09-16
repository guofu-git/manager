package CalEven;
//用while（）循环 求100以内的偶数和
public class CalEven01 {
    public static void main(String[] args) {
        int num =0 ;
        int sum = 0;
        //while ((num%2==0)&&(num<=100)){     不需要判断num%2==0    num += 2;就是每次以2增加
        while ((num<=100)){
            sum =sum + num;  //sum=sum+num;
            num += 2;
        }
        /*或者是
        * while (num<100){
            num += 2;
            sum =sum + num;  //sum=sum+num;
        }
        * */
        System.out.println("100以为的偶数和为："+sum);
    }
}
