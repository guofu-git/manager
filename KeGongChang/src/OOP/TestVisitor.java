package OOP;

import java.util.Scanner;

public class TestVisitor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "";

        do {
            Visitor v = new Visitor();
            System.out.print("请输入姓名：");
            v.name = input.next();
            System.out.print("请输入年龄：");
            v.age = input.nextInt();
            v.showPrices();
            System.out.println("是否继续？（y/n）");
            answer = input.next();

        }while (answer.equals("y"));
    }
}
