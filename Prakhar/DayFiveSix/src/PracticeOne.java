public class PracticeOne {
    //Write a Java program that defines a class representing a "Person" with attributes like name, age, and address.
    // Create multiple "Person" objects and display their information.\
    public static void main(String[] args) {
        try {
            Person per1 = new Person();
            Person per2 = new Person();
            per1.name="Prakhar";
            per1.address="Tajganj, Agra";
            per1.age= 22;
            per2.name="Yogesh";
            per2.address="Mathurawasi";
            per2.age= 23;
            per1.show();
            per2.show();

        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Person{
    String name;//default type access modifier
    int age;//default type access modifier
    String address;//default type access modifier

    void show(){
        System.out.println("Name: "+this.name+ " Age: "+this.age+" Address: "+this.address);
    }
}