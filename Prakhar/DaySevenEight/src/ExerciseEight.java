public class ExerciseEight {
    //    Exercise 8: Multiple Interfaces
//    Build a Java program that demonstrates a class implementing multiple interfaces. Create interfaces for
//    "Drawable" and "Clickable" with corresponding methods. Implement these interfaces in a class representing
//    graphical elements.
    public static void main(String[] args) {
        GraphicElement button = new GraphicElement("Button");
        System.out.println("Example of multiple interface (check the code)");
        button.click();
        button.draw();
    }

}

interface Clickable {
    void click();
}

interface Drawable {
    void draw();
}

class GraphicElement implements Clickable, Drawable {

    private String name;

    GraphicElement(String name) {
        this.name = name;
    }

    GraphicElement() {
        this.name = "Graphic Element";
    }


    @Override
    public void draw() {
        System.out.println(name + " is being Drawn");
    }

    @Override
    public void click() {
        System.out.println(name + " is being clicked");
    }
}