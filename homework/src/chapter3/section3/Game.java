package chapter3.section3;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: Game.java
 * @ProjectName: homework
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/11 9:03
 */
public class Game {

    String gameName;
    String gameType;
    int gameCapacity;
    int starClass;
    String introduction;

    public Game() {

    }

    public Game(String gameName, String gameType, int gameCapacity, int starClass, String introduction) {
        this.gameName = gameName;
        this.gameType = gameType;
        this.gameCapacity = gameCapacity;
        this.starClass = starClass;
        this.introduction = introduction;
    }

    public void gameIntroduce() {
        System.out.println(this.introduction);
    }
}
