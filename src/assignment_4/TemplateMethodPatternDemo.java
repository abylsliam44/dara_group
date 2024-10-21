abstract class Game {
    // Template method
    public final void play() {
        initializeGame();
        startPlay();
        endPlay();
    }

    protected abstract void initializeGame();
    protected abstract void startPlay();
    protected abstract void endPlay();
}

class Cricket extends Game {
    @Override
    protected void initializeGame() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    protected void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}

class Football extends Game {
    @Override
    protected void initializeGame() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    protected void endPlay() {
        System.out.println("Football Game Finished!");
    }
}

// Demo class to test the Template Method pattern
public class TemplateMethodPatternDemo {
    public static void main(String[] args) {
        Game cricket = new Cricket();
        cricket.play();

        System.out.println();

        Game football = new Football();
        football.play();
    }
