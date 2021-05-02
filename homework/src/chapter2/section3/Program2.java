package chapter2.section3;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: Program1.java
 * @ProjectName: homework
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/4 23:48
 */
public class Program2 {

    public int sumOfPlace(int number) {
        int tenThousandsPlace = number / 10000;
        int thousandPlace = number % 10000 / 1000;
        int hundredsPlace = number % 1000 / 100;
        int tensPlace = number % 100 / 10;
        int onesPlace = number % 10;
        int sum = tenThousandsPlace + thousandPlace + hundredsPlace + tensPlace + onesPlace;
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个五位数：");
        int number = input.nextInt();
        if (number < 10000 || number > 99999) {
            System.out.println("您输入的数值有误，请重新输入！");
            return;
        } else {
            System.out.println("您输入的五位数的和为：" + new Program2().sumOfPlace(number));
        }
    }
}
