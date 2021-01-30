package game;

public class Chessboard {
    public void moveCircleAt(int row, int column) {
    }

    public void moveCrossAt(int row, int column) {
    }

    public static final int CIRCLE_WIN = 0;     // 圈赢
    public static final int CROSS_WIN = 1;      // 叉赢
    public static final int DRAW = 2;           // 平局
    public static final int CONTINUE = 3;       // 游戏继续
    public int getState() {
        return -1;
    }
}
