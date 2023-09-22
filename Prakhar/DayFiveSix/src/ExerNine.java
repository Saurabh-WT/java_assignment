public class ExerNine {
    //Implement a Java class called "Vehicle" with attributes like make, model, and year.
    // Create objects for different vehicles and display their details.
    public static void main(String[] args) {
        try {
            //creating object
            Vehicle car1 = new Vehicle();
            Vehicle car2 = new Vehicle();

            //setting the remaining values
            car1.setCompany("Mahindra");//Using method to set the value because of private access example of encapsulation
            car1.setModel("Thar");
            car1.setYear(2019);
            car2.setCompany("Swift");
            car2.setModel("DZire");
            car2.setYear(2009);

            // Showing data of vehicles
            car1.show();
            car2.show();

        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
class Vehicle{
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
        System.out.println(this.company+" "+this.model+" from year "+ this.year);
    }
}