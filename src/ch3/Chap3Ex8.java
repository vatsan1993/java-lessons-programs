package ch3;

// Demo for switch with a range of values running the same operation.
public class Chap3Ex8 {
    public static void main(String[] args) {
        // Not recommended as it is running all cases 1,2,3,4
        switch(1){
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
            case 4:
                System.out.println("four");
                System.out.println("Small value!");
                break;
            case 5:
            case 6:
                System.out.println("medium value!");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("large value!");
                break;
            default:
                System.out.println("value not in range!");
                break;}



        // Recommended
        switch(7){
            case 1:

            case 2:

            case 3:

            case 4:

                System.out.println("Small value!");
                break;
            case 5:
            case 6:
                System.out.println("medium value!");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("large value!");
                break;
            default:
                System.out.println("value not in range!");
                break;}

    }
}
