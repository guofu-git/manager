package OOP;

import java.util.Scanner;

//测试用户类
public class TestUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User user = new User();
        user.name="admin";
        user.password="123456";
        System.out.print("请输入用户名：");
        String name = input.next();
        System.out.print("请输入密码：");
        String pwd = input.next();

        //判断用户名和密码是否正确
        if (name.equals(user.name) && pwd.equals(user.password)){
            System.out.print("请输入新密码：");
            user.password = input.next();   //user.password很重要
            System.out.println("修改密码成功！您的新密码是："+user.password);
        }else {
            System.out.println("用户名和密码不正确，您没有权限更新密码。");
        }

    }
}
