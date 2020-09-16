package XunHuan;

//多重if
/*买车： >=500 凯迪拉克
*       >=100 帕萨特
*       >=50  伊兰特
*       >=10  奥托
*       <10 捷安特
*  */
public class BuyCar {
    public static void main(String[] args){
        int money = 52;
        if (money >= 500){
            System.out.println("可以买凯迪拉克");
        }else if (money >= 100){
            System.out.println("可以买帕萨特");
        }else if (money >= 50){
            System.out.println("可以买伊兰特");
        }else if (money >= 10){
            System.out.println("可以买奥托");
        }else {
            System.out.println("可以买捷安特");
        }

    }
}
