package DaySevenEight;
//Exercise 1: Creating Inheritance Hierarchy
// Design a Java program that models an inheritance hierarchy for animals. Create subclasses for specific types of animals
// (e.g., mammals, birds, reptiles) that inherit from a common superclass.

//Exercise 2: Implementing Polymorphism
// Enhance the animal hierarchy from Exercise 1 to demonstrate polymorphism. Create a method in the superclass and override it in
// subclasses to display specific behaviors.
public class Practice_1_And_2 {
    public static void main(String[] args) {
        //Mammals
        Mammals plat = new Platipus(2, 4, "dark brown", "carnivorous", true, 2, "egg laying");
        plat.display();
        Mammals humans = new Humans(2,2, "skin", "omnivorous", true,4, "birth giving");
        humans.display();

        //Birds
        Birds duck = new Duck(2,4, "multi color", "omnivorous", false, "small", "small");
        duck.display();
        Birds geese = new Geese(2,4,"white and grey", "herbivorous", false, "large", "large");
        geese.display();

        //Reptiles
        Reptiles lizard = new Lizard(2, 4, "brown", "carnivorous", false, "laying eggs");
        lizard.display();
        Reptiles crocodile = new Crocodile(2,4, "green or gray", "carnivorous", false, "laying eggs");
        crocodile.display();

    }
}
class Animals{
    int eyes;
    int legs;
    String color;
    String type;
    boolean hair;
    Animals(int eyes, int legs, String color, String type, boolean hair){
        this.eyes=eyes;
        this.legs=legs;
        this.color=color;
        this.type=type;
        this.hair=hair;
    }
    void display(){
        System.out.println(eyes+" "+legs+" "+color+" "+type+" "+hair);
    }
    void genericSound(){
        System.out.println("This prints animals sound");

    }

}
class Mammals extends Animals{
    int limbs;
    String reproduction_type;

    Mammals(int eyes, int legs, String color, String type, boolean hair, int limbs, String reproduction_type) {
        super(eyes, legs, color, type, hair);
        this.limbs=limbs;
        this.reproduction_type=reproduction_type;
    }
    @Override
    void display(){
        System.out.println(eyes+" "+legs+" "+color+" "+type+" "+hair+" "+limbs+" "+reproduction_type);
    }

    @Override
    void genericSound() {
        System.out.println("Growl..............");
    }
}

class Platipus extends Mammals{
    Platipus(int eyes, int legs, String color, String type, boolean hair, int limbs, String reproduction_type){
        super(eyes, legs, color, type, hair, limbs, reproduction_type);
    }

}
class Humans extends Mammals{

    Humans(int eyes, int legs, String color, String type, boolean hair, int limbs, String reproduction_type) {
        super(eyes, legs, color, type, hair, limbs, reproduction_type);
    }
}

class Birds extends Animals{
    String body_size;
    String neck_size;
    Birds(int eyes, int legs, String color, String type, boolean hair, String body_size, String neck_size) {
        super(eyes, legs, color, type, hair);
        this.body_size=body_size;
        this.neck_size=neck_size;
    }
    @Override
    void display(){
        System.out.println(eyes+" "+legs+" "+color+" "+type+" "+hair+" "+body_size+" "+neck_size);
    }

    @Override
    void genericSound() {
        System.out.println("Chirrup....................");
    }
}
class Duck extends Birds{

    Duck(int eyes, int legs, String color, String type, boolean hair, String body_size, String neck_size) {
        super(eyes, legs, color, type, hair, body_size, neck_size);

    }
}
class Geese extends Birds{

    Geese(int eyes, int legs, String color, String type, boolean hair, String body_size, String neck_size) {
        super(eyes, legs, color, type, hair, body_size, neck_size);
    }
}

class Reptiles extends Animals{
    String reproduction_type;

    Reptiles(int eyes, int legs, String color, String type, boolean hair, String reproduction_type) {
        super(eyes, legs, color, type, hair);
        this.reproduction_type=reproduction_type;
    }
    @Override
    void display(){
        System.out.println(eyes+" "+legs+" "+color+" "+type+" "+hair+" "+reproduction_type);
    }

    @Override
    void genericSound() {
        System.out.println("Hiss.........................");
    }
}
class Crocodile extends Reptiles{

    Crocodile(int eyes, int legs, String color, String type, boolean hair, String reproduction_type) {
        super(eyes, legs, color, type, hair, reproduction_type);
    }
}
class Lizard extends Reptiles{

    Lizard(int eyes, int legs, String color, String type, boolean hair, String reproduction_type) {
        super(eyes, legs, color, type, hair, reproduction_type);
    }
}



