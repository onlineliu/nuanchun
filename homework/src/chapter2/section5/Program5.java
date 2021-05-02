package chapter2.section5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: Program5.java
 * @ProjectName: homework
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/9 0:07
 */
public class Program5 {

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

        System.out.println("转换前：" + Arrays.toString(intArr));

        return intArr;
    }

    public void todo(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 0) {
                    arr[i] = arr[j];
                    arr[j] = 0;
                }
            }
        }

        System.out.println("转换后：" + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Program5 program5 = new Program5();
        program5.todo(program5.createArray());
    }
}
