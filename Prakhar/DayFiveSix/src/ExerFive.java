public class ExerFive {
    //Q. Create a Java class hierarchy for shapes, including a "Circle" and a "Rectangle" class.
    // Implement overloaded methods to calculate the area and perimeter for both shapes.
    public static void main(String[] args) {

        try {
            //Circle
            Circle circle1 = new Circle();
            circle1.setRadius(20);// example of encapsulation
            System.out.println("In code you can checkout this is an example of hierarchy overloading");
            System.out.println("Circle Area of radius= " + circle1.showRadius() + " (hard coded): " + circle1.calculateArea());
            System.out.println("Circle Perimeter of radius= " + circle1.showRadius() + " (hard coded): " + circle1.calculatePerimeter());


            //Rectangle
            Rectangle rect1 = new Rectangle();
            rect1.breadth = 10.0;//Default access modifier example, we can access it in same module
            rect1.length = 20.0;
            System.out.println("Rectangle Area of length =" + rect1.length + " & breadth = " + rect1.breadth + " (Hard Coded) : " + rect1.calculateArea());
            System.out.println("Rectangle Perimeter of length =" + rect1.length + " & breadth = " + rect1.breadth + " (Hard Coded) : " + rect1.calculatePerimeter());


        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Shape {
    public double calculateArea() {
        return 0;
    }
    public double calculatePerimeter(){
        return 0;
    }

}

class Circle extends Shape {
    private Double radius;
    private static final double PI = 22/7;
    void setRadius(double rad){
        this.radius=rad;
    }
    public double showRadius(){
        return this.radius;
    }
    public double calculateArea() {
        if(this.radius!=null){
            return PI*this.radius*this.radius;
        }
        return 0;
    }

    public double calculatePerimeter() {
        if(this.radius!=null){
            return 2*PI*this.radius;
        }
        return 0;

    }
}

class Rectangle extends Shape {
    Double length, breadth;

    public double calculateArea() {
        if((length!=null || breadth!=null)){
            return this.breadth*this.length;
        }
        return 0;
    }

    public double calculatePerimeter() {
        if((length!=null || breadth!=null)){
            return 2*(this.breadth+this.length);
        }
        return 0;
    }
}