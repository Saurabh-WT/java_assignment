public class PracticeTwo {
    //Q. Create a Java class called "Car" with attributes like make, model, and year.
    // Implement methods to set and retrieve these attributes.
    public static void main(String[] args) {
        try {
            Car car1 = new Car();
            Car car2 = new Car();
            car1.setCompany("Ford");//Using method to set the value because of private access
            car1.setModel("Mustang");
            car1.setYear(2009);
            car2.setCompany("Tesla");
            car2.setModel("Model S");
            car2.setYear(2020);
            car1.show();
            car2.show();

        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Car {
    private String company;//default type access modifier
    private String model;//default type access modifier
    private int year;//default type access modifier

    void setCompany(String company){
        this.company=company;
    }

    void setModel(String model){
        this.model=model;
    }

    void setYear(int year){
        this.year=year;
    }
    void show(){
        System.out.println(this.company+" "+this.model+" From year "+ this.year);
    }
}