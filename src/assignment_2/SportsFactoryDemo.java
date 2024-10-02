//Factory Method Pattern

//Slamzhanov Abylay SE-2330


package assignment_2;

interface Athlete {
    void play();
}

class FootballPlayer implements Athlete {
    private String position;

    public FootballPlayer(String position) {
        this.position = position;
    }

    public void play() {
        System.out.println("Playing football as a " + position + ".");
    }
}

class BasketballPlayer implements Athlete {
    private String position;

    public BasketballPlayer(String position) {
        this.position = position;
    }

    public void play() {
        System.out.println("Playing basketball as a " + position + ".");
    }
}

class AthleteFactory {
    public Athlete createAthlete(String sport, String position) {
        if (sport.equalsIgnoreCase("FOOTBALL")) {
            return new FootballPlayer(position);
        } else if (sport.equalsIgnoreCase("BASKETBALL")) {
            return new BasketballPlayer(position);
        }
        return null;
    }
}

public class SportsFactoryDemo {
    public static void main(String[] args) {
        AthleteFactory factory = new AthleteFactory();

        Athlete footballPlayer = factory.createAthlete("FOOTBALL", "striker");
        footballPlayer.play();

        Athlete basketballPlayer = factory.createAthlete("BASKETBALL", "point guard");
        basketballPlayer.play();
    }
}
