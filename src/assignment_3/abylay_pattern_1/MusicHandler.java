
//Chain of Responsibility

package assignment_3.abylay_pattern_1;

abstract class MusicHandler {
    protected String genre;

    
    protected MusicHandler nextHandler;

    public void setNextHandler(MusicHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(String genre, String song) {
        if (this.genre.equals(genre)) {
            play(song);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(genre, song);
        }
    }

    protected abstract void play(String song);
}



class ClassicalMusicHandler extends MusicHandler {
    public ClassicalMusicHandler() {
        this.genre = "Classical";
    }

    @Override
    protected void play(String song) {
        System.out.println("Classical Music Specialist is playing the song: " + song);
    }
}

class RockMusicHandler extends MusicHandler {
    public RockMusicHandler() {
        this.genre = "Rock";
    }

    @Override
    protected void play(String song) {
        System.out.println("Rock Music Specialist is rocking the song: " + song);
    }
}

class PopMusicHandler extends MusicHandler {
    public PopMusicHandler() {
        this.genre = "Pop";
    }

    @Override
    protected void play(String song) {
        System.out.println("Pop Music Specialist is playing the song: " + song);
    }
}
