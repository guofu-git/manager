package OOP;
//游人类
public class Visitor {
    String name;
    int age;
    public void showPrices(){
        if (age<=10){
            System.out.println("门票免费！");
        }else if (age<=60){
            System.out.println("门票全费：20元！");
        }else {
            System.out.println("门票半价：10元！");
        }
    }
}
