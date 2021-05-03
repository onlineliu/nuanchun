package com.java.main;

import com.java.bean.Express;
import com.java.dao.ExpressDao;
import com.java.view.Views;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: main.java
 * @ProjectName: Demo1
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/5/3 9:58
 */
public class Main {

    /**
     * 初始化视图对象
     */
    private static Views v = new Views();
    /**
     * 初始化DAO对象
     */
    private static ExpressDao dao = new ExpressDao();

    public static void main(String[] args) {
        // 1.欢迎
        v.welcome();
        // 2.弹出身份选择菜单
        int menu = v.menu();

        while (true) {
            switch (menu) {
                case 0:
                    v.bye();
                    System.exit(0);
                    return;
                case 1:
                    cClient();
                    break;
                case 2:
                    uClient();
                    break;
                default:
                    System.out.println("请的输入有误，请重新输入！");
            }
        }
    }

    private static void cClient() {
        while (true) {
            int menu = v.cMenu();

            switch (menu) {
                case 0:
                    return;
                case 1: {
                    // 存储快递
                    // 1.提示输入快递信息
                    Express e = v.insert();
                    // 2.判断此快递是否已经存储过
                    Express e2 = dao.findByNumber(e.getNumber());
                    // 3.存储快递
                    if (e2 == null) {
                        // 说明e2未被存储过，此时可存
                        dao.add(e);
                        v.printExpress(e);
                    } else {
                        // 说明单号在快递柜中已存在
                        v.expressExist();
                    }
                }
                    break;
                case 2: {
                    // 修改快递
                    // 1.提示输入快递信息
                    String number = v.findByNumber();
                    // 2.查找此单号的快递是否在快递柜中
                    Express e = dao.findByNumber(number);
                    // 3.打印快递信息
                    if (e == null) {
                        v.printNull();
                    } else {
                        v.printExpress(e);
                        // 4.提示修改
                        v.update(e);
                        // 由于传的是对象，所以在执行v.update(e)时，对象已经被更新
                        dao.update(e, e);
                        v.printExpress(e);
                    }
                }
                    break;
                case 3: {
                    // 删除快递
                    // 1.输入快递单号
                    String number = v.findByNumber();
                    // 2.查找快递对象
                    Express e = dao.findByNumber(number);
                    // 3.打印快递信息
                    if (e == null) {
                        v.printNull();
                    } else {
                        v.printExpress(e);
                        // 4.提示删除
                        int type = v.delete();
                        if (type == 1) {
                            dao.delete(e);
                            v.operationSuccess();
                        }
                    }
                }
                    break;
                case 4: {
                    // 查看所有
                    Express[][] data = dao.findAll();
                    v.printAll(data);
                }
                    break;
                default:

            }
        }
    }

    private static void uClient() {
        // 1.取件码的获取
        int code = v.uMenu();
        // 2.根据取件码取出快递
        Express e = dao.findByCode(code);
        if (e == null) {
            v.printNull();
        } else {
            v.operationSuccess();
            v.printExpress(e);
        }
    }

    public static void init() {

    }
}
