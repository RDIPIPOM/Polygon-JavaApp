package org.example;

public class Rectangle implements Polygon  {
    private double widthSize;
    private double lengthSize;

    public Rectangle(double widthSize, double lengthSize){
        this.widthSize = widthSize;
        this.lengthSize = lengthSize;
    }

    @Override
    public double getArea() {
        return widthSize*lengthSize;
    }

    public int getSides(){
        return 4;
    }
}
