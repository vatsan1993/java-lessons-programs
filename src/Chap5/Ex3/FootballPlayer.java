package Chap5.Ex3;

public class FootballPlayer {
    private String name;
    private int number;
    private int matchesPlayed;
    private int matchesWon;
    private int matchesLost;
    private double rating;
    private Height height;

    public FootballPlayer(String name, int number, int matchesPlayed, int matchesWon, int matchesLost, double rating, Height height) {
        this.name = name;
        this.number = number;
        this.matchesPlayed = matchesPlayed;
        this.matchesWon = matchesWon;
        this.matchesLost = matchesLost;
        this.rating = rating;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getMatchesWon() {
        return matchesWon;
    }

    public void setMatchesWon(int matchesWon) {
        this.matchesWon = matchesWon;
    }

    public int getMatchesLost() {
        return matchesLost;
    }

    public void setMatchesLost(int matchesLost) {
        this.matchesLost = matchesLost;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public double winningAverage(){
        return matchesWon/matchesPlayed;
    }

    public double loosingAverage(){
        return matchesLost/matchesPlayed;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", matchesPlayed=" + matchesPlayed +
                ", matchesWon=" + matchesWon +
                ", matchesLost=" + matchesLost +
                ", rating=" + rating +
                ", height=" + height.toString() +
                '}';
    }
}
