package DayFiveSix;
interface Shape{
    void area();
    void perimeter();
}
abstract class Rec implements Shape{
    double len;
    double breadth;
    static void area(double len, double breadth){
        System.out.println("Area of rectange = "+len*breadth);
    }
    static void perimeter(double len, double breadth){
        System.out.println("Perimeter of rectangle = "+2*(len+breadth));
    }
}
abstract class Circle implements Shape{
    double radius;
    static void area(double radius){
        System.out.println("Area of circle = "+Math.PI*radius*radius);
    }
    static void perimeter(double radius){
        System.out.println("Perimeter of circle = "+2* Math.PI*radius*radius);
    }
}
public class Ex5 {
    public static void main(String[] args) {
        Rec.area(5,8);
        //Rec.perimeter(5,7);
        //Circle.area(4);
        //Circle.perimeter(6);

    }
}
