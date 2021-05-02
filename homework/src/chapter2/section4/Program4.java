package chapter2.section4;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: Program4.java
 * @ProjectName: homework
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/2 17:57
 */
public class Program4 {

    public void multiplicationTable() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + '\t');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Program4().multiplicationTable();
    }
}
