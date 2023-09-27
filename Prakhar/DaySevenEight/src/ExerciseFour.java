import java.util.SortedMap;

public class ExerciseFour {
    //Exercise 4: Polymorphic Animals
    //Enhance the animal hierarchy from Exercise 1 to demonstrate polymorphism. Create a method in the superclass
    // that prints a generic animal sound. Override this method in subclasses to produce specific sounds for each
    // animal type.
    public static void main(String[] args) {
        try {
            System.out.println();
            System.out.println("Demonstrating polymorphism method overriding (check the class code) ");


            Animal tig = new Tiger();
            Animal dog = new Dog();
            System.out.println();
            tig.talk();
            dog.talk();

            Animal spar = new Sparrow();
            System.out.println();
            spar.talk();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

class Animal {

    void talk() {
        System.out.println("Animal sound......");
    }


}

class Mammal extends Animal {
    @Override
    void talk() {
        System.out.println("Mammal sound......");
    }
}

class Bird extends Animal {
    @Override
    void talk() {
        System.out.println("Bird sound......");
    }
}

class Sparrow extends Bird {
    @Override
    void talk() {
        System.out.println("chirp chirp......");
    }
}

class Tiger extends Mammal {
    @Override
    void talk() {
        System.out.println("Roar Roar......");
    }
}

class Dog extends Mammal{
    @Override
    void talk() {
        System.out.println("Bark Bark.....");
    }
}

