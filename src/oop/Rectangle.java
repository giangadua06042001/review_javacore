package oop;

public class Rectangle extends Geometry{
    public Rectangle() {
    }

    public Rectangle(double with, double height) {
        super(with, height);
    }
    public double acreage(){
        return getWith()*getHeight();
    }
}
