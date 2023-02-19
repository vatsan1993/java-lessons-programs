// Program that shows Box class with main method in the same class.
package Chap4.Ex5;

public class Box {
        private int id= 1;
        private double length = 10.4;
        private double width= 7.3;
        private double height= 5.2;
        private String units= "cms";

        public void calcVolume(double reductionPercent){
                double volume= length * width*height;
                double finalVolume= volume- (volume* reductionPercent);
                System.out.println("The volume after reduction is: "+finalVolume );
        }


        public void display(){
                System.out.println("Box "+id);
                System.out.println("Length: "+length+ " "+units);
                System.out.println("Width: "+width+ " "+units);
                System.out.println("Height: "+height+ " "+units);
                System.out.println("");

        }

}
