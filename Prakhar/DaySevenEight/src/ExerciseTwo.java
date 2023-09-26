public class ExerciseTwo {
    //Exercise 2: Method Overriding
    //Design a Java program with a superclass "Shape" that contains an abstract method to calculate the area. Create
    // subclasses for different shapes like circle, rectangle, and triangle, and override the area calculation method
    // in each subclass.
    public static void main(String[] args) {
        Circle circle1 = new Circle(20);

        System.out.println("In code you can checkout this is an example of hierarchy overloading");
        System.out.println("Circle Area of radius= " + circle1.getRadius() + " : " + circle1.calculateArea());


        //Rectangle
        Rectangle rect1 = new Rectangle(10, 20);
        System.out.println("Rectangle Area of length =" + rect1.getLength() + " & breadth = " + rect1.getBreadth() +
                "  : " + rect1.calculateArea());



    }
}

abstract class Shape {

     abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;
    private static final double PI = (double) 22 / 7;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(int radius) {
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
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Rectangle() {
    }

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Rectangle(double length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Rectangle(int length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return breadth * length;
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
