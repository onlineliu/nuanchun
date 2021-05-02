package chapter3.section5;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: MyList.java
 * @ProjectName: homework
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/24 22:32
 */
public class MyList {

    private int size = 0;

    /**
     * 在数组末尾添加一个元素，数组长度增1。
     * @param element
     * @param obj
     * @return
     */
    public Object[] add(Object[] element, Object obj) {
        int index = element.length;

        for (int i = 0; i < element.length; i++) {
            if (element[i] == null) {
                index = i;
                break;
            }
        }

        if (index < element.length) {
            element[index] = obj;
        } else {
            element = Arrays.copyOf(element, element.length + 1);
            element[element.length - 1] = obj;
        }

        return element;
    }

    /**
     * 在数组中根据下标删除一个元素，数组长度减1。
     * @param element
     * @param index
     * @return
     */
    public Object[] remove(Object[] element, int index) {
        //Object[] elementNew = null;

        if ((index < 0) || (index > element.length - 1)) {
            System.out.println("您输入的下标有误！");
        } else if (index == element.length - 1) {
            // 若待删除的下标是数组最后一个元素的下标，则把该元素设为null
            element[index] = null;
        } else {
            for (int i = index; i < element.length - 1; i++) {
                element[i] = element[i + 1];
            }
            element[element.length - 1] = null;
        }

        element = Arrays.copyOf(element, element.length - 1);
        return element;
    }

    /**
     * 返回数组中指定下标的数据。
     * @param element
     * @param index
     */
    public Object get(Object[] element, int index) {
        for (int i = 0; i < element.length; i++) {
            if (element[i] != null) {
                this.size++;
            }
        }
        System.out.println("数组 " + Arrays.toString(element) + " 有效数据长度为：" + this.size);

        if ((index < 0) || (index > element.length - 1)) {
            System.out.println("您输入的下标有误！");
            return null;
        } else {
            return element[index];
        }
    }
}
