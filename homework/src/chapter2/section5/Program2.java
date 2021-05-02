package chapter2.section5;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: Programs.java
 * @ProjectName: homework
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/8 16:39
 */
public class Program2 {

    public static void main(String[] args) {
        System.out.println("---请依次输入10个整数---");
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("请输入第" + (i + 1) + "个整数：");
            array[i] = input.nextInt();
        }

        int min = array[0];
        int max = array[0];

        // 求最大值、最小值
        for (int i = 0; i < 10; i++) {
            if (array[i] > max) {
                max = array[i];
            }

            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("数组中最大值为：" + max);
        System.out.println("数组中最小值为：" + min);
    }
}
