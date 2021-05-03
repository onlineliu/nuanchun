package com.java.dao;

import com.java.bean.Express;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: ExpressDao.java
 * @ProjectName: Demo1
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/29 20:56
 */
public class ExpressDao {

    private Express[][] data = new Express[10][10];
    private int size = 0;
    private Random random = new Random();
    private Scanner input = new Scanner(System.in);

    {
        for (int i = 0; i < 10; i++) {
            data[i] = new Express[10];
        }
    }

    /**
     * 用于存储快递
     * @param e
     * @return
     */
    public boolean add(Express e) {
        if (size == 100) {
            return false;
        }
        // 1.随机生成两个0～9的下标
        int x = -1;
        int y = -2;
        while (true) {
            x = random.nextInt(10);
            y = random.nextInt(10);
            if (data[x][y] == null) {
                // 此位置无快递，可以存储
                break;
            }
        }
        // 2.取件码
        int code = randomCode();
        e.setCode(code);
        data[x][y] = e;
        return true;
    }

    private int randomCode() {
        int code = random.nextInt(900000) + 10000;
        Express e = findByCode(code);

        while (true) {
            if (e == null) {
                return code;
            }
        }
    }

    public Express findByNumber(String number) {
        Express e = new Express();
        e.setNumber(number);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (e.equals(data[i][j])) {
                    return data[i][j];
                }
            }
        }
        return null;
    }

    /**
     * 根据取件码查询快递
     * @param code 要查询的取件码
     * @return 查询的结果，查询失败进返回null
     */
    public Express findByCode(int code) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (data[i][j] != null) {
                    if (data[i][j].getCode() == code) {
                        return data[i][j];
                    }
                }
            }
        }
        return null;
    }

    /**
     * 多余的操作，为了MVC更圆润
     * @param oldExpress
     * @param newExpress
     */
    public void update(Express oldExpress, Express newExpress) {
        delete(oldExpress);
        add(newExpress);
    }

    public void delete(Express e) {
        p:for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (e.equals(data[i][j])) {
                    data[i][j] = null;
                    break p;
                }
            }
        }
    }

    public Express[][] findAll() {
        return data;
    }

}
