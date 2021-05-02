package chapter3.section4;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: Book.java
 * @ProjectName: homework
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/12 14:20
 */
public class Book {

    private String title;
    private int pageNum;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        if (pageNum < 200) {
            System.out.println("页数不能小于200，否则默认设置为200页。");
            this.pageNum = 200;
        } else {
            this.pageNum = pageNum;
        }
    }

    public void detail() {
        System.out.println("图书名称为：《" + title + "》，页数为：" + pageNum + "页。");
    }
}
