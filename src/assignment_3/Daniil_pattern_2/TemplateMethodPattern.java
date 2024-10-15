public class TemplateMethodPattern {
    public static void main(String[] args) {
        Game game = new Football();
        game.playGame();
        System.out.println();

        game = new Chess();
        game.playGame();
    }
}
