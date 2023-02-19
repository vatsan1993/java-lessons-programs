package ch3;

public class Chap3Ex42 {
    public static void main(String[] args) {
        // easy triangle
        for (int i = 1; i< 10; i++){ // counts line number
            for (int j= 1; j<=i; j++){ // counts number of starts
                System.out.print("*");
            }
            System.out.println();
        }

        // triangle with spaces /// for even or odd number of lines
        for (int i = 1; i< 10; i++){ // counts line number
            int spaces= 10 -i; // spaces = number of lines - current line number
            for (int j=0; j< spaces; j++){
                System.out.print(" ");
            }
            for (int j= 1; j<=i; j++){ // number of starts = line number
                System.out.print("* ");
            }
            System.out.println();
        }

        // trangle pattern more complex. (odd number of stars)

        for (int i = 1; i< 10; i++){// counts line number
            int spaces= 10 -i;// spaces = number of lines - current line number
            for (int j=0; j< spaces; j++){// spaces = number of lines - current line number
                System.out.print(" ");
            }
            int stars= 2*i-1;// number of starts = 2n -1 where n is the line number. Number of stars is always odd number,
            for (int j= 1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
