// Program that shows Box class with main method in the same class.
package Chap4.Ex14;

public class Box {
        private int id;
        private double length;
        private double width;
        private double height;
        private String units;

        public Box(int id, double length, double width, double height, String units) {
                this.id = id;
                this.length = length;
                this.width = width;
                this.height = height;
                this.units = units;
        }

        public double calcVolume(double reductionPercent){
                double volume= length * width*height;
                double finalVolume= volume- (volume* reductionPercent);
                return finalVolume;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public double getLength() {
                return length;
        }

        public void setLength(double length) {
                this.length = length;
        }

        public double getWidth() {
                return width;
        }

        public void setWidth(double width) {
                this.width = width;
        }

        public double getHeight() {
                return height;
        }

        public void setHeight(double height) {
                this.height = height;
        }

        public String getUnits() {
                return units;
        }

        public void setUnits(String units) {
                this.units = units;
        }

        public void display(){
                System.out.println("Box "+id);
                System.out.println("Length: "+length+ " "+units);
                System.out.println("Width: "+width+ " "+units);
                System.out.println("Height: "+height+ " "+units);
                System.out.println("");

        }

        @Override
        public String toString() {
                return "Box{" +
                        "id=" + id +
                        ", length=" + length +
                        ", width=" + width +
                        ", height=" + height +
                        ", units='" + units + '\'' +
                        '}';
        }

        @Override
        public boolean equals(Object obj){
                if(obj instanceof Box){
                        Box another= (Box) obj;
                        if(this.length== another.length && this.width== another.width && this.height== another.height && this.units.equals( another.units)){
                                return true;
                        }
                }
                return false;
        }

}
