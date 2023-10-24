package oop;

public class Rectangle extends Geometry{


    public Rectangle(String name, double with, double height) {
        super(name, with, height);
    }

    public Rectangle() {
    }



    public double acreage(){
        return getWith()*getHeight();
    }
}
