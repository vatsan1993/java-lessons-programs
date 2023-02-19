// Program that shows Box class with main method in the same class.
package Chap4.Ex9;

public class Box {
        private int id;
        private double length;
        private double width;
        private double height;
        private String units;

        public Box(int id, double length, double width, double height, String units){
                this.id= id;
                this.length= length;
                this.width= width;
                this.height= height;
                this.units= units;
        }

        public double calcVolume(double reductionPercent){
                double volume= length * width*height;
                double finalVolume= volume- (volume* reductionPercent);
                return finalVolume;
        }



        public void display(){
                System.out.println("Box "+id);
                System.out.println("Length: "+length+ " "+units);
                System.out.println("Width: "+width+ " "+units);
                System.out.println("Height: "+height+ " "+units);
                System.out.println("");

        }

}
