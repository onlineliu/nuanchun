package chapter2.section5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: Program3.java
 * @ProjectName: homework
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/8 17:15
 */
public class Program3 {

    Scanner scanner = new Scanner(System.in);
    String str;

    public int[] createArray() {
        // 构建不定长数组
        System.out.print("请输入数组元素，以空格分隔：");
        str = scanner.nextLine();
        String[] strArr = str.split(" ");
        int[] intArr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        System.out.println("nums = " + Arrays.toString(intArr));

        return intArr;
    }

    public void todo(int[] arr) {
        System.out.print("请输入target数字：");
        int target = scanner.nextInt();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + " , " + j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Program3 program3 = new Program3();
        program3.todo(program3.createArray());
    }
}
