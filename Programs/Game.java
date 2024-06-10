package Programs;

public class Game {

    public void startGame() {
        class Player {
            private String name;
            private int score;

            public Player(String name, int score) {
                this.name = name;
                this.score = score;
            }

            public void displayScore() {
                System.out.println("Player " + name + " scored " + score);
            }
        }

        Player player = new Player("Alice", 100);
        player.displayScore();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
    }
}
