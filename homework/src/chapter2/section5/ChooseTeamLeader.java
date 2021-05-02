package chapter2.section5;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: ChooseTeamLeader.java
 * @ProjectName: homework
 * @Description: 用数组实现循环报数问题，算法的时间复杂度为O(n)
 * @Author: LiuCZ
 * @Create: 2021/4/5 23:39
 */
public class ChooseTeamLeader {
    /**
     * 为提高程序的通用性，该函数设有两个形参，一个接收人数，一个接收所要报的数
     * @param peoples
     * @param num
     */
    public void count(int peoples, int num) {
        // 创建长度为peoples的boolean型数组，初始值全部赋true
        boolean[] array = new boolean[peoples];
        for (int i = 0; i < peoples; i++) {
            array[i] = true;
        }
        // 存放数组下标的循环变量
        int index = 0;
        // 记数变量，从0自增到num
        int count = 0;
        // 记录数组中剩余的值为true的元素个数，初始值为peoples
        int n = peoples;
        // 重复执行循环体，直到数组中只剩下最后一个元素
        while (n > 1) {
            if (array[index] == true) {
                count++;
                // 当count等于num时，就淘汰此时下标为index的元素，即将该位置元素值置为false
                if (count == num) {
                    array[index] = false;
                    // 当有一个元素被淘汰时，剩余值为true的元素个数就相应减1，否则循环无法正常结束
                    n--;
                    // 找到应淘汰的元素后，将count的值重置为0，重新记数
                    count = 0;
                }
            }
            // 继续判断下一个元素
            index++;
            // 从数组下标为0的元素一直判断到下标为peoples-1的元素，若index等于peoples，
            // 则表示数组最后一个元素已经比较过了，此时应将下标重新置0
            if (index == peoples) {
                index = 0;
            }
        }

        // 经过上面的循环，数组中仅剩的值为true的元素即是我们要输入的元素，输出其下标，
        // 由于数组下标是从0开始，故在输入序号时要加1
        for (int i = 0; i < peoples; i++) {
            if (array[i] == true) {
                System.out.println("队长是 " + (i + 1) + " 号同学。");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入围成一圈的人数：");
        int peoples = input.nextInt();
        System.out.print("请输入所要报的数：");
        int num = input.nextInt();

        new ChooseTeamLeader().count(peoples, num);
    }
}
