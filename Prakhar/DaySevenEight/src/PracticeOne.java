public class PracticeOne {
    //Design a Java program that models an inheritance hierarchy for animals.
    // Create subclasses for specific types of animals (e.g., mammals, birds,
    // reptiles) that inherit from a common superclass.
    public static void main(String[] args) {
        System.out.println("Mammal sub-class inheriting function from Animal parent class");
        Animals cat = new Mammals();
        cat.eat();
        cat.walk();
        cat.sleep();

        System.out.println();
        System.out.println("Birds sub-class inheriting function from Animal parent class");
        Animals sparrow = new Birds();
        sparrow.eat();
        sparrow.walk();
        sparrow.sleep();

        System.out.println();
        System.out.println("Reptile sub-class inheriting function from Animal parent class");
        Animals lizard =  new Reptiles();
        lizard.eat();
        lizard.walk();
        lizard.sleep();
    }
}
 class Animals{
    void walk(){
        System.out.println("Walking...");
    }
    void eat(){
        System.out.println("Eating...");
    }
    void sleep(){
        System.out.println("Sleeping...");
    }
 }

 class Mammals extends Animals{

 }
 class Birds extends Animals{

 }

 class Reptiles extends Animals{

 }