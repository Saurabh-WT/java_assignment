package DaySevenEight;

public class Exercise1 {
    public static void main(String[] args) {
        //Car object
        Vechiles v1 = new Car(4,4);
        System.out.println(v1.getWheels());
        v1.display();
        v1.break_fun();

        //Motorcycle object
        Vechiles v2 = new Motorcycle(2,2);
        System.out.println(v2.getWheels());
        v2.display();
        v2.break_fun();

        //Bicycle object
        Vechiles v3 = new Bicycle(2, 1);
        System.out.println(v3.getWheels());
        v3.display();

    }
}
class Vechiles{
    private int wheels;
    private int seater;
    Vechiles(int wheels, int seater){
        this.wheels=wheels;
        this.seater=seater;
    }
    void break_fun(){
        System.out.println("This is break function for any vechile");
    }

    public int getWheels() {
        return wheels;
    }
    void display(){
        System.out.println("Number of wheels are = "+wheels+" and seater is = "+seater);
    }

}

class Car extends Vechiles{
    Car(int wheels, int seater) {
        super(wheels, seater);
    }
    @Override
    void break_fun(){
        System.out.println("This is break function for car");
    }
}
class Motorcycle extends Vechiles{

    Motorcycle(int wheels, int seater) {
        super(wheels, seater);
    }
    @Override
    void break_fun(){
        System.out.println("This is break function for Motorcycle");
    }
}
class Bicycle extends Vechiles{

    Bicycle(int wheels, int seater) {
        super(wheels, seater);
    }
    @Override
    void break_fun() {
        System.out.println("This is break function for Bicycle");
    }
}