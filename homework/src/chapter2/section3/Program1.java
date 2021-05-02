package chapter2.section3;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: Program1.java
 * @ProjectName: homework
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/4 23:02
 */
public class Program1 {

    public boolean isPalindromeNumber(int number) {
        int tenThousandsPlace = number / 10000;
        int thousandPlace = number % 10000 / 1000;
        int tensPlace = number % 100 / 10;
        int onesPlace = number % 10;
        if ((tenThousandsPlace == onesPlace) && (thousandPlace == tensPlace)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个五位数：");
        int number = input.nextInt();
        if (number < 10000 || number > 99999) {
            System.out.println("您输入的数值有误，请重新输入！");
            return;
        } else {
            if (new Program1().isPalindromeNumber(number)) {
                System.out.println(number + " is a palindrome number.");
            } else {
                System.out.println(number + " is not a palindrome number.");
            }
        }
    }
}
