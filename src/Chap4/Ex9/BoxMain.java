package Chap4.Ex9;

public class BoxMain {
    public static void main(String[] args) {
        // create object
        Box b1= new Box(1, 15.4, 12.3, 7.3, "cms"); // b1 is the object.
        Box b2= new Box(2, 6, 4.3, 1.2, "inches"); // b2 is the object.

        int id= 3;
        double len=4.6;
        double wid=2.6;
        double hei=0.6;
        String uni="inches";
        Box b3= new Box(id, len,wid,hei, uni);

        b1.display();

        b2.display();
        b3.display();
        double vol= b1.calcVolume(0.05);
        System.out.println(vol);
        System.out.println(b2.calcVolume(0.1));




    }
}
