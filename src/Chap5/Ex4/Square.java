package Chap5.Ex4;

public class Square extends Rectangle{
    public Square(double side){
        super(side, side);
    }


    @Override
    public String toString(){
        return "Square{side="+getLength()+"}";
    }
}
