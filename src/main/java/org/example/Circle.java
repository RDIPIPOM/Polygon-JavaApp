package org.example;

public class Circle implements Polygon  {
    private float radiusSize;

    public Circle(float radiusSize){
        this.radiusSize = radiusSize;
    }

    @Override
    public double getArea() {
        return Math.PI * (radiusSize * radiusSize);
    }

    public int getSides(){
        return 0;
    }
}
