package chapter2.section4;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: Program3.java
 * @ProjectName: homework
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/1 16:58
 */
public class Program3 {

    public void demo1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public void demo2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public void demo3() {
        // 控制行数
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n - 1; j++) {
                System.out.print(' ');
            }

            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Program3().demo1();
        System.out.println(">=====<");
        new Program3().demo2();
        System.out.println(">=====<");
        new Program3().demo3();
    }
}
