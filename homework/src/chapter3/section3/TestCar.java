package chapter3.section3;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: TestCar.java
 * @ProjectName: homework
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/11 8:56
 */
public class TestCar {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "宝马";
        car1.color = Color.BLACK;
        car1.show();

        Car car2 = new Car("奔驰", Color.WHITE);
        car2.show();
    }
}
