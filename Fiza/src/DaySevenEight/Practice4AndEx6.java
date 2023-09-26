package DaySevenEight;

//Q4 in practice and Q6 in exercise
public class Practice4AndEx6 {
    public static void main(String[] args) {
        try {
            //parameterized circle
            Shape s1 = new Circle(4);
            //area
            System.out.println("The area of circle is " + s1.area());
            //perimeter
            System.out.println("The perimeter of circle is " + s1.perimeter());
            //not parameterized
            Characteristics c1 = new Circle();
            System.out.println("Color of circle is " + c1.getColor());

            //parameterized rectangle
            Shape s2 = new Rectangle(4, 9);
            //area
            System.out.println("The area of rectangle is " + s2.area());
            //perimeter
            System.out.println("The perimeter of rectangle is " + s2.perimeter());
            //not parameterized
            Characteristics c2 = new Rectangle();
            System.out.println("Color of rectangle is " + c2.getColor());

        }
        catch (RuntimeException e) {
            System.out.println(e.getLocalizedMessage());
            System.out.println("Invalid input");
        }
        }

    }

//abstract class
abstract class Shape{
    abstract double area();

    abstract double perimeter();
}

//interface
interface Characteristics{
    String color = null;
    String getColor();
}

class Circle extends Shape implements Characteristics{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    //default constructor
    Circle(){

    }
    @Override
    double area(){
        return Math.PI*radius*radius;
    }
    @Override
    double perimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String getColor() {
        return "Blue";
    }
}

class Rectangle extends Shape implements Characteristics{
    double length;
    double breadth;

    Rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    //default constructor
    Rectangle(){

    }
    @Override
    double area(){
        return length*breadth;
    }
    @Override
    double perimeter(){
        return 2*(length+breadth);
    }

    @Override
    public String getColor() {
        return "Red";
    }
}

