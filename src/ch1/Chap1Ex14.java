package ch1;
// comparision and logical operators, conditions
public class Chap1Ex14 {
    public static void main(String[] args) {
        int a= 20;
        boolean result= a>0 && a<=100;
        System.out.println(result);

        int age= 40;
        boolean isEligibleForVoting= age>18 && age <= 80;
        System.out.println(isEligibleForVoting);

        // player wins if the players score is greater than the 100 or players gold collected is greater than 1000
        int score = 20;
        int goldCollected= 1500;
        boolean didPlayerWin= score>100 || goldCollected>1000;
        System.out.println(didPlayerWin);

        // player died
        // player Alive
        // if health <=0;
        int playerHealth= 20;
        boolean didDie= playerHealth<=0;
        boolean isAlive= ! didDie;
        System.out.println(didDie);
        System.out.println(isAlive);
        //        boolean isAlive= ! (playerHealth<=0);

        // x not less than 10 and y not less than 10
        int x= 20;
        int y= 15;
        boolean isGreater= !(x<10) && !(y<10);
        boolean isGreater2= !(x<10 || y<10);
        System.out.println(isGreater2);

        // y is not divisible by 3 or y is not divisible by 5
        // Also can be wriiten as y divisible  by 3 but not 5
        // or
        // y divisible  by 5 but not 3
        boolean notDivisible= y%3!=0 || y%5!=0;
        boolean notDivisible2= !(y%3==0 && y%5==0);
        System.out.println(notDivisible2);
    }
}
