package org.example;

public class App 
{
    public static void main( String[] args )
    {
        Polygon square1 = new Square(8);
        Polygon circle1 = new Circle(4);
        Polygon rectangle1 = new Rectangle(4, 6);
        System.out.println("Number of sides of square1: " + square1.getSides());
        System.out.println("Area of square1: " + square1.getArea());
        System.out.println("Number of sides of circle1: " + circle1.getSides());
        System.out.println("Area of circle1: " + circle1.getArea());
        System.out.println("Number of sides of rectangle1: " + rectangle1.getSides());
        System.out.println("Area of rectangle1: " + rectangle1.getArea());
    }
}
