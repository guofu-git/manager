package XunHuan;

// while()循环 例子：打印50份试卷
public class PrintExam {
    public static void main(String[] args){
        int paperNmber = 1;
        while (paperNmber <= 50){
            System.out.println("打印第"+paperNmber+"份试卷！");
            paperNmber++;   //注意自加、否则程序陷入死循环   paperNmber++;的存在是为了程序能够退出循环
        }
    }
}
