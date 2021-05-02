package chapter2.section4;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: Program1.java
 * @ProjectName: homework
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/3/31 11:07
 */
public class Program1 {

    public void discount(double price, double memberPoint) {
        double amount = 0;
        if (memberPoint <= 2000) {
            amount = price * 0.9;
        } else if (memberPoint <= 4000) {
            amount = price * 0.8;
        } else if (memberPoint <= 8000) {
            amount = price * 0.75;
        } else {
            amount = price * 0.7;
        }

        System.out.println("您享受的会员价为：" + amount);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入商品原价：");
        double price = input.nextDouble();
        System.out.println("请输入您的会员积分：");
        double memberPoint = input.nextDouble();

        new Program1().discount(price, memberPoint);
    }
}
