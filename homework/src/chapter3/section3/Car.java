package chapter3.section3;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: Program1.java
 * @ProjectName: homework
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/11 8:38
 */
public class Car {

    public Car() {

    }

    public Car(String brand, Color color) {
        this.brand = brand;
        this.color = color;
    }

    String brand;
    Color color;

    public void show() {
        System.out.println("汽车的品牌为：" + brand + "，汽车的颜色为：" + color);
    }
}

enum Color {
    BLACK, BLUE, GRAY, GREEN, PINK, PURPLE, RED, SILVER, WHITE, YELLOW
}
