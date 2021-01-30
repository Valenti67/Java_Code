package game;

public class Game {
    private final Chessboard chessboard;
    private final Player player;
    private final AI ai;

    public Game(Player player) {
        this.chessboard = new Chessboard();
        this.player = player;
        this.ai = new AI();
    }

    // 游戏开始之前，进行一些准备工作
    public void initialize() {
        System.out.println("欢迎进入《井字棋》游戏");
        System.out.println("规则说明如下：省略……");
        System.out.println(chessboard);
        System.out.println("=====================================");
    }

    // 游戏主流程 —— 回合制
    public void play() {
        while (true) {
            if (playerTurn()) {
                break;
            }

            if (aiTurn()) {
                break;
            }
        }
    }

    // 游戏结束之前，完成一些收尾工作
    public void destroy() {
    }

    private boolean playerTurn() {
        int[] rc = player.getRowColumn();
        int row = rc[0];
        int column = rc[1];

        chessboard.moveCircleAt(row, column);

        return chessboard.getState() != Chessboard.CONTINUE;
    }

    private boolean aiTurn() {
        int[] rc = ai.getRowColumn();
        int row = rc[0];
        int column = rc[1];

        chessboard.moveCrossAt(row, column);

        return chessboard.getState() != Chessboard.CONTINUE;
    }
}
