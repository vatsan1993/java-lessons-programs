package Chap4.Ex26;

public class DieRace {
    public static void main(String[] args) {
        Die d1= new Die();
        Die d2= new Die();

        int player1=0;
        int player2= 0;
        while (true){
            d1.roll();
            player1+= d1.getDieFace();
            d2.roll();
            player2+= d2.getDieFace();

            if(player1>=50 ){
                System.out.println(player1);
                System.out.println("Player 1 wins");
                break;
            }
            if(player2>=50){
                System.out.println(player2);
                System.out.println("Player 2 wins");
                break;
            }
        }
    }
}
