package chapter2.section3;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: Program3.java
 * @ProjectName: homework
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/5 8:47
 */
public class Program3 {

    public void swap(int num1, int num2) {
        System.out.println("交换前的第一个数是：" + num1 + "，第二个数是：" + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("交换后的第一个数是：" + num1 + "，第二个数是：" + num2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个整数num1：");
        int num1 = input.nextInt();
        System.out.println("请输入第二个整数num2：");
        int num2 = input.nextInt();
        new Program3().swap(num1, num2);
    }
}
