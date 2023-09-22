package DayFiveSix;
class Vechile{
    String make;
    String model;
    int year;

    //constructor
    Vechile(String make, String model, int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
    void displayDetails(){
        System.out.println("Car model is "+model+" by "+make+" and manufacturing year is "+year);
    }
}

public class Ex9
{
    public static void main(String[] args) {
        Vechile v1 = new Vechile("Tata","Nexon", 2021);
        Vechile v2 = new Vechile("Kia","Seltos", 2021);
        Vechile v3 = new Vechile("Mahindra","Thar", 2020);
        v1.displayDetails();
        v2.displayDetails();
        v3.displayDetails();

    }
}
