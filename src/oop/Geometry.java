package oop;

public class Geometry {
    private double with;
    private double height;

    public Geometry() {
    }

    public Geometry(double with, double height) {
        this.with = with;
        this.height = height;
    }

    public double getWith() {
        return with;
    }

    public void setWith(double with) {
        this.with = with;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double acreage(){
        return with*height;
    }

}
