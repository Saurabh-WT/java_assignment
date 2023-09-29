package DaySevenEight;
//Exercise 10: Abstract Class and Interface Combination
//Create an abstract class "Vehicle" with attributes like make, model, and year. Implement this class in subclasses for different vehicle types (e.g., car, motorcycle). Additionally,
// implement interfaces for "Drivable" and "FuelEfficient" and showcase how the class combines both abstract class and interface features.
public class Exercise10 {
    public static void main(String[] args) {
        //car
        Cars c = new Cars("Mahindra","Thar", 2020);
        c.print();
        c.accelerate();
        System.out.println(c.fuelEfficiency(500, 300));

        //motorcycle
        Motorcycles m = new Motorcycles("Yamaha","FZS FI BS6", 2022);
        m.print();
        m.breaks();

    }
}
abstract class Vechile{
    String make;
    String model;
    int year;
    Vechile(String make, String model, int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
    void print(){

    }
}
class Cars extends Vechile implements Drivable, FuelEfficient{


    Cars(String make, String model, int year) {
        super(make, model, year);

    }

    @Override
    public void drive() {
        System.out.println("This method is used to drive the car");
    }

    @Override
    public void breaks() {
        System.out.println("This method is used to apply break");

    }

    @Override
    public void accelerate() {
        System.out.println("This method is used to accelerate the car");

    }

    @Override
    public double fuelEfficiency(double kms, double lts) {
        return kms/lts;
    }
    @Override
    void print(){
        System.out.println("Make "+make+", Model "+model+", Year "+year);
    }
}
class Motorcycles extends Vechile implements Drivable, FuelEfficient{

    Motorcycles(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void drive() {
        System.out.println("This method is used to drive the car");

    }

    @Override
    public void breaks() {
        System.out.println("This method is used to apply break");

    }

    @Override
    public void accelerate() {
        System.out.println("This method is used to accelerate the car");

    }

    @Override
    public double fuelEfficiency(double kms, double lts) {
        return kms / lts;
    }
    @Override
    void print(){
        System.out.println("Make "+make+", Model "+model+", Year "+year);
    }
}
interface Drivable{
    void drive();
    void breaks();
    void accelerate();

}
interface FuelEfficient{
    double fuelEfficiency(double kms , double lts);

}
