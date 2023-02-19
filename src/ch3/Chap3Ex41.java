package ch3;

import java.util.Random;

// Player switching
public class Chap3Ex41 {
    public static void main(String[] args) {
        String p1= "Player1";
        String p2= "Player2";
        String nextPlayer= p1;
        boolean won= false;
        while (won!= true){
            // player plays then swith
            int diceRoll= new Random().nextInt(7);
            System.out.println(nextPlayer+ " "+ diceRoll);
            if(diceRoll== 6){
                won= true;
            }
            else{
                // main logic to switch player.
                nextPlayer= nextPlayer.equals(p1)? p2: p1;
            }
        }
        System.out.println(nextPlayer+ " won the game. ");


    }
}
