public class PracticeFour {
    //Create an abstract class called "Shape" with abstract methods for calculating area and perimeter. Implement
    // this class in concrete subclasses for different shapes (e.g., circle, rectangle). Also, implement interface to
    // show additional behavior.

    public static void main(String[] args) {

        try {
            System.out.println("In code you can checkout this is an example of Interface and class combination");


            Circle1 circle1 = new Circle1(20.0);
            System.out.println();
            System.out.println("Circle Area of radius= " + circle1.getRadius() + " : " + circle1.calculateArea());
            System.out.println("Circle Perimeter of radius= " + circle1.getRadius() + " (hard coded): " + circle1.calculatePerimeter());
            circle1.draw();//this is method of interface

            //Rectangle
            Rectangle1 rect1 = new Rectangle1(10, 20);
            System.out.println();
            System.out.println("Rectangle Area of length =" + rect1.getLength() + " & breadth = " + rect1.getBreadth() + "  : " + rect1.calculateArea());
            System.out.println("Rectangle Perimeter of length = " + rect1.getLength() + " & breadth = " + rect1.getBreadth() + " (Hard Coded) : " + rect1.calculatePerimeter());
            rect1.draw();// method of interface it was override on rectangle class
        }catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

interface Drawable1 {
    void draw();
}

abstract class Shape1 {

    abstract double calculateArea();

    abstract double calculatePerimeter();
}

class Circle1 extends Shape1 implements Drawable1 {
    private double radius;
    private static final double PI = (double) 22 / 7;

    Circle1() {
    }

    Circle1(double radius) {
        this.radius = radius;
    }


    void setRadius(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle......");
    }
}

class Rectangle1 extends Shape1 implements Drawable1 {
    private double length;
    private double breadth;


    Rectangle1() {
    }

    Rectangle1(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    @Override
    public double calculateArea() {
        return breadth * length;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle.......");
    }
}
