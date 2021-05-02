package chapter2.section5;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: Program4.java
 * @ProjectName: homework
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/8 20:35
 */
public class Program4 {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 9, 5, 6, 7, 15, 4, 8};
        System.out.println("排序前：" + Arrays.toString(array));
        int target = 6;
        int minIndex = 0;
        int maxIndex = array.length - 1;
        int midIndex = (minIndex + maxIndex) / 2;

        // 冒泡排序
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println("排序后：" + Arrays.toString(array));

        // 二分查找
        while (true) {
            if (array[midIndex] < target) {
                minIndex = midIndex + 1;
                midIndex = (minIndex + maxIndex) / 2;
            } else if (array[midIndex] > target) {
                maxIndex = midIndex - 1;
                midIndex = (minIndex + maxIndex) / 2;
            } else {
                 break;
            }

            if (minIndex > maxIndex) {
                midIndex = -1;
                break;
            }
        }

        if (midIndex == -1) {
            System.out.println("数组中没有找到值为 " + target + " 的元素。");
        } else {
            System.out.println("值为 " + target + " 的元素，其下标为 " + midIndex);
        }
    }
}
