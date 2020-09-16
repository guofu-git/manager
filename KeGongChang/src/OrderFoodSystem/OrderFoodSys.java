package OrderFoodSystem;
//Java基础 综合案例：吃货联盟订单系统
import java.util.Scanner;

/*定义数据主体
        菜品信息（序号	菜名	单价  点赞数）  -订餐、点赞
        订单信息（序号	订餐人	餐品信息		送餐时间	送餐地址		总金额	订单状态）  -查看餐袋*/
public class OrderFoodSys {
    public static void main(String[] args) {
        //数据主体：菜品信息
        String[] dishNames ={"鱼香肉丝","宫保鸡丁","时令蔬菜"};//菜名：dishNames
        double[] prices = {20,25,10};                       //单价：prices
        int[] praiseNums = new int[3];                      //点赞数：praiseNums
        //数据主体：订单信息
        String[] names = new String[4];             //订餐人：names
        String[] dishMsg = new String[4];           //餐品信息：菜品名称+定份数
        int[] times = new int[4];                   //餐品信息：times
        String[] addresses = new String[4];         //送餐地址：addresses
        double[] sumPrices = new double[4];         //总金额：sumPrices
        int[] states = new int[4]; // 0:已预订   1：已完成

        //初始化订单信息（即：给订单信息，加两条初始数据---小芙、小乔）
        names[0] = "小芙";
        dishMsg[0] ="鱼香肉丝 3份";
        times[0] =10;
        addresses[0] ="桃花坞";
        sumPrices[0] =60;    //餐费>50，免配送； <50,自费6块
        states[0] =0;       //已预订，但还未配送

        names[1] = "小乔";
        dishMsg[1] ="时令蔬菜 1份";
        times[1] =10;
        addresses[1] ="九州渠";
        sumPrices[1] =16;
        states[1] =1;       //配送完了，订单已完成

        //搭建框架
        Scanner input = new Scanner(System.in);
        //定义退出状态    退出：true   不退出：false
        boolean flag = false;

        int num = -1;
        do {
            System.out.println("\n欢迎使用“吃货联盟订餐系统！”");
            System.out.println("1、我要订餐");
            System.out.println("2、查看餐袋");
            System.out.println("3、签收订单");
            System.out.println("4、删除订单");
            System.out.println("5、我要点赞");
            System.out.println("6、退出系统");
            System.out.print("请选择：");
        int choose = input.nextInt();
        switch (choose){
            case 1:
                System.out.println("\n------------我要订餐------------");
                //判断订餐前，订单是不是未满。boolean变量isAdd：来标识订单是否满了的结果，满了flase不能订餐，反之能订餐
                boolean isAdd = false;
                for (int i=0; i<names.length; i++) {
                    if (names[i] == null) {
                        //进入循环，订单为空，即订单未满，可以订餐
                        isAdd = true;
                        //订餐
                        System.out.print("请输入订餐人姓名：");
                        String name = input.next();

                        //1、遍历菜品信息
                        System.out.println("序号\t菜名\t\t单价");
                        for (int j=0; j<dishNames.length; j++){
                            //判断赞数是否为空，为空则不输出；不为空，需要输出赞数
                            String praise = (praiseNums[j]==0) ? "" : praiseNums[j]+"赞";
                            System.out.println((j+1)+"\t\t"+dishNames[j]+"\t\t"+prices[j]+"\t\t"+praise);
                         }

                        //2、菜品编号的输入及判断
                        System.out.print("请输入您要点的菜品编号：");
                        int no = input.nextInt();
                        while (no<1 || no>dishNames.length){
                            System.out.print("本店没有这个菜品，请重新选择：");
                            no = input.nextInt();
                        }

                        //3、点菜份数
                        System.out.print("请输入您需要的份数：");
                        int number = input.nextInt();

                        //4、配送时间
                        System.out.print("请输入您需要的份数：送餐时间：（只能在10:00-20:00）");
                        int time = input.nextInt();
                        while (time<10 || time>20){
                            System.out.print("您输入有误，请输入10-20之间的整数：");
                            time = input.nextInt();
                        }

                        //5、地址
                        System.out.print("请输入送餐地址：");
                        String address = input.next();

                        //6、输出订单信息给用户看
                        System.out.println("订单成功！");
                        //菜品信息 ：菜品名称 + 份数
                        String dishInfo = dishNames[no-1]+" "+number + "份";
                        System.out.println("您订的是："+dishInfo);
                        System.out.println("送餐时间："+time+"点");
                        //餐费  配送费  总计
                        double dishPrice =prices[no-1]*number;  //单价*份数=餐费
                        double peiSong = (dishPrice>50)?0:6;
                        double sumPrice = dishPrice+peiSong;
                        System.out.println("餐费："+dishPrice+"元\t"+"配送费："+peiSong+"; 总计："+sumPrice+"元");

                        //7、把订餐信息添加到订单信息，插入的位置i
                        names[i]=name;
                        dishMsg[i]=dishInfo;
                        times[i]=time;
                        addresses[i]=address;
                        sumPrices[i]=sumPrice;
                        break;  //跳出循环
                       }
                    }
                    if (!isAdd){
                        System.out.println("对不起，您的餐袋已满！");
                    }

                break;
            case 2:
                System.out.println("\n------------查看餐袋------------");
                System.out.println("序号\t订餐人\t\t订餐菜品\t\t\t配送时间\t\t配送地址\t\t订餐金额\t\t订单状态");
                for(int i=0; i<names.length; i++){
                    if (names[i]!=null) {
                        String time = times[i]+"点";
                        String state = states[i]==0 ? "已预订" : "已完成";
                        System.out.println((i+1)+"\t\t"+names[i] + "\t\t" + dishMsg[i] + "\t\t" +time + "\t\t" + addresses[i]+"\t\t"+sumPrices[i]+"\t\t"+state);
                       }
                    }
                break;
            case 3:
                System.out.println("\n------------签收订单------------");
                //签收之前，判断订单是否存在? boolean
                boolean isSign = false;
                System.out.print("您输入您要签收的订单编号：");
                int signNo = input.nextInt();
                for (int i=0; i<names.length; i++){
                    if (names[i]!=null && states[i]==0 && i==signNo-1){
                        //有订单信息，并且用户输入的订单编号能找到
                        isSign = true;
                        //并且订单状态为已预订，能签收
                        states[i] = 1;
                        System.out.println("订单签收成功！");
                    }else if (names[i]!=null && states[i]==1 && i==signNo-1){
                        //有订单信息，并且用户输入的订单编号能找到
                        isSign = true;
                        //但是订单状态为已完成，所以不能签收
                        System.out.println("您选择的订单已完成签收，不能再签收了！");
                    }
                }
                if (!isSign){
                    System.out.println("您选择的订单不存在！");
                }

                break;
            case 4:
                System.out.println("\n------------删除订单------------");
                //删除之前，判断订单是否存在? boolean
                boolean isDelete = false;
                System.out.print("您输入您要删除的订单编号：");
                int deleteNo = input.nextInt();
                for (int i=0; i<names.length; i++){
                    if (names[i]!=null && states[i]==0 && i==deleteNo-1){
                        //有订单信息，并且用户输入的订单编号能找到
                        isSign = true;
                        //并且订单状态为已预订，不能删除
                        System.out.println("您选择的订单未签收，不能删除！");
                    }else if (names[i]!=null && states[i]==1 && i==deleteNo-1){
                        //有订单信息，并且用户输入的订单编号能找到
                        isSign = true;
                        //但是订单状态为已完成，能删除
                        //找到删除订单的位置下标：i  把i后的元素以此往前移动一位，最后一位元素要置空
                        //注意：移动的过程，是把后一个元素往前一个元素复制的过程

                        for (int j=i; j<names.length-1; j++){
                            names[j] = names[j+1];
                            dishMsg[j] = dishMsg[j+1];
                            times[j] = times[j+1];
                            addresses[j] = addresses[j+1];
                            sumPrices[j] = sumPrices[j+1];
                            states[j] = states[j+1];
                        }
                        //最后一个元素置空，才可以下新的订单
                        names[names.length-1] = null;
                        dishMsg[names.length-1] = null;
                        times[names.length-1] = 0;
                        addresses[names.length-1] = null;
                        sumPrices[names.length-1] = 0;
                        states[names.length-1] = 0;

                        System.out.println("删除订单成功！");
                    }
                }
                if (!isDelete){
                    System.out.println("您选择的订单不存在！");
                }
                break;
            case 5:
                System.out.println("\n------------我要点赞------------");
                //循环输出菜品信息
                System.out.println("序号\t菜名\t\t单价");
                for (int j=0; j<dishNames.length; j++){
                    //判断赞数是否为空，为空则不输出；不为空，需要输出赞数
                    String praise = (praiseNums[j]==0) ? "" : praiseNums[j]+"赞";
                    System.out.println((j+1)+"\t\t"+dishNames[j]+"\t\t"+prices[j]+"\t\t"+praise);
                }
                //点赞
                System.out.print("请输入您要点赞的菜品编号：");
                int praiseNo = input.nextInt();
                while (praiseNo<1 || praiseNo>dishNames.length){
                    System.out.print("本店没这个菜品，无法点赞！重新输入：");
                    praiseNo = input.nextInt();
                }
                /*关键点： 把哪个位置的点赞数+1、点赞餐品的位置 = praiseNo-1*/
                praiseNums[praiseNo-1]++;
                break;
            case 6:
                //退出系统
                flag = true;
                break;
            default:
                //退出系统
                flag = true;
                break;
        }
        if (flag==false) {
            System.out.print("请输入0返回主菜单：");
            num = input.nextInt();
        }else {
            break;
        }
        }while (num == 0);
        System.out.println("谢谢您的使用！欢迎下次光临！");
    }
}
