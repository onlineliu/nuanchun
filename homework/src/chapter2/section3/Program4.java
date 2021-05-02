package chapter2.section3;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: Program4.java
 * @ProjectName: homework
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/5 8:57
 */

/**
 * 本应将类名命名为HelloWorld，但为了文件名称统一，故将类名命名为Program4
 * 类的命名遵循大驼峰原则，所有单词的首字母大写
 */
public class Program4 {
    /**
     * 创建名为helloWorld的方法，以实现程序要求
     * 方法的命名遵循小驼峰原则，首单词全部小定，后面单词的首字母大写
     */
    public void helloWorld() {
        // 输出“Hello World!”
        System.out.println("Hello World!");
    }

    /**
     * 创建main()方法来调用helloWorld()方法
     * @param args
     */
    public static void main(String[] args) {
        new Program4().helloWorld();
    }
}
