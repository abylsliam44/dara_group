
//Chain of Responsibility

package assignment_3.abylay_pattern_1;
public class MusicStudio {

    private static MusicHandler getChainOfHandlers() {

        MusicHandler classicalHandler = new ClassicalMusicHandler();
        MusicHandler rockHandler = new RockMusicHandler();
        MusicHandler popHandler = new PopMusicHandler();

        classicalHandler.setNextHandler(rockHandler);
        rockHandler.setNextHandler(popHandler);

        return classicalHandler;
    }

    public static void main(String[] args) {
        MusicHandler handlerChain = getChainOfHandlers();

        handlerChain.handleRequest("Classical", "Beethoven - Symphony No.5");
        handlerChain.handleRequest("Rock", "Led Zeppelin - Stairway to Heaven");
        handlerChain.handleRequest("Pop", "Taylor Swift - Blank Space");
        handlerChain.handleRequest("Jazz", "Miles Davis - So What"); 
    }
}
