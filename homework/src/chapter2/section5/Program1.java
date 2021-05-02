package chapter2.section5;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: Program1.java
 * @ProjectName: homework
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/8 15:37
 */
public class Program1 {

    public static void main(String[] args) {
        System.out.println("---请依次输入10个整数---");
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("请输入第" + (i + 1) + "个整数：");
            array[i] = input.nextInt();
        }

        System.out.print("请输入想查找的数字：");
        int num = input.nextInt();
        boolean flag = false;

        for (int i = 0; i < 10; i++) {
            if (array[i] == num) {
                flag = true;
                System.out.println(i);
            }
        }

        if (flag == false) {
            System.out.println("数组中没有找到你想查找的数字！");
        }
    }
}
