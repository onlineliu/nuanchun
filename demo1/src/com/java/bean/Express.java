package com.java.bean;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: Express.java
 * @ProjectName: Demo1
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/29 10:35
 */

import java.util.Objects;

/**
 * 快递
 */
public class Express {

    /**
     * 单号
     */
    private String number;
    /**
     * 公司
     */
    private String company;
    /**
     * 取件码
     */
    private int code;

    public Express(String number, String company, int code) {
        this.number = number;
        this.company = company;
        this.code = code;
    }

    public Express() {

    }

    @Override
    public String toString() {
        return "Express{" +
                "number='" + number + '\'' +
                ", company='" + company + '\'' +
                ", code=" + code +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Express)) {
            return false;
        }
        Express express = (Express) o;
        return getNumber().equals(express.getNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber());
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
