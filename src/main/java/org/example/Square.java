package org.example;

public class Square implements Polygon  {
    private double sideSize;

    public Square(double sideSize){
        this.sideSize = sideSize;
    }

    @Override
    public double getArea() {
        return sideSize*sideSize;
    }

    public int getSides(){
        return 4;
    }
}
