public class ExerciseSix {
    //    Exercise 6: Abstract Shape Class
//    Create an abstract class called "Shape" with abstract methods for calculating area and perimeter. Implement
//    this class in subclasses for different shapes (e.g., circle, rectangle).
    public static void main(String[] args) {

        try {
            System.out.println("In code you can checkout this is an example of hierarchy overloading");

            Circles circle1 = new Circles(20);
            System.out.println();
            System.out.println("Circle Area of radius= " + circle1.getRadius() + " (hard coded): " + circle1.calculateArea());
            System.out.println("Circle Perimeter of radius= " + circle1.getRadius() + " (hard coded): " + circle1.calculatePerimeter());

            //Rectangle
            Rectangles rect1 = new Rectangles(10, 20);
            System.out.println();
            System.out.println("Rectangle Area of length =" + rect1.getLength() + " & breadth = " + rect1.getBreadth() + " (Hard Coded)  : " + rect1.calculateArea());
            System.out.println("Rectangle Perimeter of length = " + rect1.getLength() + " & breadth = " + rect1.getBreadth() + " (Hard Coded) : " + rect1.calculatePerimeter());
        }catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}

abstract class Shapes {

    abstract double calculateArea();

    abstract double calculatePerimeter();
}

class Circles extends Shapes {
    private double radius;
    private static final double PI = (double) 22 / 7;

    Circles() {
    }

    Circles(double radius) {
        this.radius = radius;
    }

    Circles(int radius) {
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
}

class Rectangles extends Shapes {
    private double length;
    private double breadth;

    Rectangles(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Rectangles() {
    }

    Rectangles(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Rectangles(double length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Rectangles(int length, double breadth) {
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

}
