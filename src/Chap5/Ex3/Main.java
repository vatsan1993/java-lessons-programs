package Chap5.Ex3;

public class Main {
    public static void main(String[] args) {
        Height h1= new Height(5,9);
        FootballPlayer player1= new FootballPlayer("Phillipe Anderson", 15, 30, 20, 6,4.3,h1);
        System.out.println(player1);
    }
}
