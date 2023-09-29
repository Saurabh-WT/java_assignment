package DaySevenEight;
//Exercise 4: Polymorphic Animals
//Enhance the animal hierarchy from Exercise 1 to demonstrate polymorphism. Create a method in the superclass that prints
// a generic animal sound. Override this method in subclasses to produce specific sounds for each animal type.
public class Exercise4 {
    public static void main(String[] args) {
        //Mammals generic sound
        Mammals m = new Mammals(2, 4, "dark brown", "carnivorous", true, 2, "egg laying");
        m.genericSound();

        //Birds generic sound
        Birds b = new Birds(2,4, "multi color", "omnivorous", false, "small", "small");
        b.genericSound();

        //Reptiles generic sound
        Reptiles r = new Reptiles(2, 4, "brown", "carnivorous", false, "laying eggs");
        r.genericSound();
    }


}
