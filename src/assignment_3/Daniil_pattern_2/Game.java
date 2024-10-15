public abstract class Game {
    // Шаблонный метод (Template Method)
    public final void playGame() {
        initialize();
        startPlay();
        endPlay();
    }

    // Шаги, которые должны реализовать подклассы
    protected abstract void initialize();
    protected abstract void startPlay();
    protected abstract void endPlay();
}
