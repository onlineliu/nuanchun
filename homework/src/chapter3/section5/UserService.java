package chapter3.section5;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: UserService.java
 * @ProjectName: homework
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/24 20:43
 */
public class UserService {

    private String userName;
    private String password;
    Scanner reader = new Scanner(System.in);

    public void login() {
        System.out.println("请输入用户名：");
        this.userName = reader.next();
        System.out.println("请输入密码：");
        this.password = reader.next();
        if ((this.userName.equals("admin")) && (this.password.equals("123"))) {
            System.out.println("登录成功！");
        } else {
            System.out.println("用户名或密码有误，请重新输入！");
        }
    }

    public static void main(String[] args) {
        new UserService().login();
    }
}
