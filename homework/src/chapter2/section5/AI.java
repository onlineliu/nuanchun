package chapter2.section5;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: AI.java
 * @ProjectName: homework
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/5 23:14
 */
public class AI {

    public static void main(String[] args) {
        // 定义Scanner对象以从键盘获得输入
        Scanner input = new Scanner(System.in);
        // 定义字符串类型的变量question
        String question;
        // 创建一个永真循环，不断从键盘获取question
        while (true) {
            question = input.nextLine();
            // 把原问题中的“吗”替换成空字符，然后重新赋给question
            question = question.replace("吗", "");
            // 把原问题中的“我”替换成“我也”，然后重新赋给question
            question = question.replace("我", "我也");
            // 把原问题中的"？"替换为"！"，然后重新赋给question
            question = question.replace("？", "！");
            // 把替换后的question，作为答案输出
            System.out.println(question);
        }
    }
}
