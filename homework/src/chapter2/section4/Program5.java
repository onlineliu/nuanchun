package chapter2.section4;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: Program5.java
 * @ProjectName: homework
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/2 18:23
 */
public class Program5 {

    public void narcissisticNumber() {
        for (int i = 100; i <= 999; i++) {
            int hundredsPlace = i / 100;
            int tensPlace = i % 100 / 10;
            int onesPlace = i % 10;
            if (hundredsPlace * hundredsPlace * hundredsPlace +
                    tensPlace * tensPlace * tensPlace +
                        onesPlace * onesPlace * onesPlace == i) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        new Program5().narcissisticNumber();
    }
}
