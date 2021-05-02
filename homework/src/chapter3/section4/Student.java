package chapter3.section4;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: Student.java
 * @ProjectName: homework
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/12 15:40
 */
public class Student {

    private String name;
    private int age;
    private char sexual;
    private String hobby;
    static String company = "开课吧";
    static String subject = "Java学科";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSexual() {
        return sexual;
    }

    public void setSexual(char sexual) {
        this.sexual = sexual;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Student.company = company;
    }

    public static String getSubject() {
        return subject;
    }

    public static void setSubject(String subject) {
        Student.subject = subject;
    }
}
