package com.java.view;

import com.java.bean.Express;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: Views.java
 * @ProjectName: Demo1
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/28 10:35
 */
public class Views {

    private Scanner input = new Scanner(System.in);

    /**
     * 欢迎
     */
    public void welcome() {
        System.out.println("欢迎使用快递管理系统！");
    }

    /**
     * 再见
     */
    public void bye() {
        System.out.println("欢迎下次使用~~~");
    }

    /**
     * 选择用户身份的菜单
     * @return
     */
    public int menu() {
        System.out.println("请跟据提示，输入功能序号：");
        System.out.println("1.快递员");
        System.out.println("2.普通用户");
        System.out.println("0.退出");

        // 此处的代码相较于input.nextInt()，优点在于所有方法均使用nextLine()，
        // 不会因为输入产生冲突，还可以更好地接收各种类型的数据。
        String text = input.nextLine();
        int num = -1;

        try {
            num = Integer.parseInt(text);
        } catch (NumberFormatException e) {

        }

        if (num < 0 || num > 2) {
           return menu();
        }

        return num;
    }

    /**
     * 快递员的菜单
     * @return
     */
    public int cMenu() {
        System.out.println("请跟据提示，输入功能序号：");
        System.out.println("1. 快递录入");
        System.out.println("2. 快递修改");
        System.out.println("3. 快递删除");
        System.out.println("4. 查看所有快递");
        System.out.println("0. 退出");

        String text = input.nextLine();
        int num = -1;

        try {
            num = Integer.parseInt(text);
        } catch (NumberFormatException e) {

        }

        if (num < 0 || num > 4) {
            System.out.println("您输入的取件有误，请重新输入：");
            return cMenu();
        }

        return num;
    }

    /**
     * 插入快递信息
     * @return
     */
    public Express insert() {
        String number = this.findByNumber();
        System.out.println("请输入快递公司");
        String company = input.nextLine();
        Express e = new Express();
        e.setCompany(company);
        e.setNumber(number);
        return e;
    }

    /**
     * 提示用户输入快递单号
     * @return
     */
    public String findByNumber() {
        System.out.println("请根据提示，输入快递信息：");
        System.out.println("请输入要操作的快递单号：");
        String number = input.nextLine();
        return number;
    }

    /**
     * 显示快递信息
     * @param e
     */
    public void printExpress(Express e) {
        System.out.println("快递信息如下：");
        System.out.println("快递公司：" + e.getCompany() +
                "，快递单号：" + e.getNumber() + "，取件码：" + e.getCode());
    }

    /**
     * 修改快递信息
     * @param e
     */
    public void update(Express e) {
        System.out.println("请输入新的快递单号：");
        String newNumber = input.nextLine();
        System.out.println("请输入新的快递公司：");
        String newCompany = input.nextLine();
        e.setNumber(newNumber);
        e.setCompany(newCompany);
    }

    /**
     * 询问是否删除
     * @return 1表示确认，2表示取消操作
     */
    public int delete() {
        System.out.println("是否确认删除？");
        System.out.println("1. 确认删除");
        System.out.println("2. 取消操作");

        String text = input.nextLine();
        int num = -1;

        try {
            num = Integer.parseInt(text);
        } catch (NumberFormatException e) {

        }

        if (num < 1 || num > 2) {
            System.out.println("输入有误，请重新输入！");
            return delete();
        }

        return num;
    }

    public void printAll(Express[] es) {
        if (es == null || es.length == 0) {
            System.out.println("暂无快递");
            return;
        }

        for (Express e : es) {
            printExpress(e);
        }
    }

    /**
     * 用户的菜单
     * @return
     */
    public int uMenu() {
        System.out.println("请根据提示，进行取件：");
        System.out.println("请输入的您的取件码：");

        String code = input.nextLine();
        int num = -1;

        try {
            num = Integer.parseInt(code);
        } catch (NumberFormatException e) {

        }

        if (num < 100000 || num > 999999) {
            System.out.println("您输入的取件有误，请重新输入：");
            return uMenu();
        }

        return num;
    }

}
