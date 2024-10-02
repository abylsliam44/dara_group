//Singleton Pattern

//Slamzhanov Abylay SE-2330

package assignment_2;

public class Scoreboard {
    private static final Scoreboard instance = new Scoreboard();
    private int teamAScore = 0;
    private int teamBScore = 0;

    private Scoreboard() {}

    public static Scoreboard getInstance() {
        return instance;
    }

    public void updateScore(String team, int points) {
        if (team.equalsIgnoreCase("Team A")) {
            teamAScore += points;
        } else if (team.equalsIgnoreCase("Team B")) {
            teamBScore += points;
        }
        displayScores();
    }

    public void displayScores() {
        System.out.println("Team A: " + teamAScore + " | Team B: " + teamBScore);
    }

    public static void main(String[] args) {
        Scoreboard scoreboard = Scoreboard.getInstance();
        scoreboard.updateScore("Team A", 3);
        scoreboard.updateScore("Team B", 2);
        scoreboard.updateScore("Team A", 1);
    }
}
