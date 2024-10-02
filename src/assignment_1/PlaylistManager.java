

// Made by Abylay Slamzhanov SE-2330

import java.util.ArrayList;
import java.util.List;

// SRP (Single Responsibility Principle)
public class PlaylistManager {
    private List<Playable> playlist;

    public PlaylistManager() {
        this.playlist = new ArrayList<>();
    }

    // OCP (Open/Closed Principle)
    public void addSong(Playable song) {
        playlist.add(song);
    }

    // LSP (Liskov Substitution Principle)
    public void removeSong(Playable song) {
        playlist.remove(song);
    }

    // ISP (Interface Segregation Principle)
    public void playAll() {
        for (Playable song : playlist) {
            song.play();
        }
    }
}
// DIP (Dependency Inversion Principle)
interface Playable {
    void play();
}

class Song implements Playable {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing: " + title + " by " + artist);
    }
}