package chapter3.section5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: MyListTest.java
 * @ProjectName: homework
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/25 23:08
 */
public class MyListTest {

    public static void main(String[] args) {
        MyList myList = new MyList();
        Object[] element1 = new Object[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Object[] element2 = new Object[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Object[] element3 = new Object[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner reader = new Scanner(System.in);

        System.out.print("请输入您想在数组1中新增的元素值：");
        Object obj = reader.next();
        System.out.println(Arrays.toString(myList.add(element1, obj)));

        System.out.print("请输入您想在数组2中删除的元素下标：");
        int index = reader.nextInt();
        System.out.println(Arrays.toString(myList.remove(element2, index)));

        System.out.print("请输入您想在数组3中查询的元素下标：");
        index = reader.nextInt();
        System.out.println(myList.get(element3, index).toString());
    }
}
