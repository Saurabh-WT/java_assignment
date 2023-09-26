public class PracticeTwo {
    //    Enhance the animal hierarchy from Exercise 1 to demonstrate polymorphism. Create a method in the superclass
    //    and override it in subclasses to display specific behaviors.
    public static void main(String[] args) {
        System.out.println("Mammal1 sub-class Overriding Methods/Functions from Animal1 parent class");
        Animal1 cat = new Mammal1();
        cat.eat();
        cat.walk();
        cat.sleep();

        System.out.println();
        System.out.println("Bird1 sub-class Overriding Methods/function from Animal1 parent class");
        Animal1 sparrow = new Bird1();
        sparrow.eat();
        sparrow.walk();
        sparrow.sleep();

        System.out.println();
        System.out.println("Reptile1 sub-class Overriding Methods/function from Animal1 parent class");
        Animal1 lizard =  new Reptile1();
        lizard.eat();
        lizard.walk();
        lizard.sleep();
    }

}

class Animal1 {

    void walk() {
        System.out.println("Walking....");
    }

    void eat() {
        System.out.println("Eating....");
    }

    void sleep() {
        System.out.println("Sleeping.....");
    }
}

class Mammal1 extends Animal1 {
    @Override
    void walk(){
        System.out.println("Mammal Walking...");
    }
    @Override
    void eat() {
        System.out.println("Mammal Eating....");
    }
    @Override
    void sleep() {
        System.out.println("Mammal Sleeping.....");
    }
}



class Bird1 extends Animal1 {
    @Override
    void walk() {
        System.out.println("Bird Flying....");
    }
    @Override
    void eat() {
        System.out.println("Bird Eating....");
    }
    @Override
    void sleep() {
        System.out.println("Bird Sleeping.....");
    }
}

class Reptile1 extends Animal1 {
   @Override
   void walk() {
        System.out.println("Walking....");
    }
    @Override
    void eat() {
        System.out.println("Eating....");
    }
    @Override
    void sleep() {
        System.out.println("Sleeping.....");
    }
}