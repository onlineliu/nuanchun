package chapter3.section4;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: BookTest.java
 * @ProjectName: homework
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/12 14:31
 */
public class BookTest {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("未来简史");
        book1.setPageNum(380);
        book1.detail();

        Book book2 = new Book();
        book2.setTitle("线性代数");
        book2.setPageNum(150);
        book2.detail();
    }
}
