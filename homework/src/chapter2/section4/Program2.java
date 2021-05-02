package chapter2.section4;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: Program2.java
 * @ProjectName: homework
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/1 16:12
 */
public class Program2 {

    public void daysOfMonth(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + "月有31天。");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + "月有30天。");
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("闰年的" + month + "月有29天。");
                } else {
                    System.out.println("平年的" + month + "月有28天。");
                }
                break;
            default:
                System.out.println("您输入的月份有误！");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = input.nextInt();
        System.out.println("请输入月份：");
        int month = input.nextInt();

        new Program2().daysOfMonth(year, month);
    }
}
