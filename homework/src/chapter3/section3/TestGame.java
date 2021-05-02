package chapter3.section3;

/**
 * Created by IntelliJ IDEA.
 *
 * @Title: TestGame.java
 * @ProjectName: homework
 * @Description: TODO
 * @Author: LiuCZ
 * @Create: 2021/4/11 12:28
 */
public class TestGame {

    public static void main(String[] args) {
        Game game = new Game();
        game.gameName = "刺客信条";
        game.gameType = "动作冒险类（ACT）游戏";
        game.gameCapacity = 3000;
        game.starClass = 5;
        game.introduction = "该游戏系列是以超高的自由度和精美的画面作为最大卖点的动作类游戏。\n玩家将在每部游戏中控制一名刺客，通过在任务中巧妙穿插重要的历史人物及历史事件带给玩家深沉的代入感。";
        game.gameIntroduce();
    }
}
