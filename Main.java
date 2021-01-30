package game;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Game game = new Game(player);
        while (true) {
            game.initialize();

            game.play();

            game.destroy();

            boolean b = player.queryContinue();
            if (!b) {
                System.out.println("欢迎下次继续游戏!");
                break;
            }
        }
    }
}
