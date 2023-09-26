public class PracticeFive {
    //Create a Java program that demonstrates a class implementing multiple interfaces with different methods.
    // Showcase how the class fulfills the requirements of each interface.

    public static void main(String[] args) {
        GraphicElement button = new GraphicElement("Button");
        System.out.println("Example of multiple interface (check the code)");
        button.click();
        button.draw();
    }

}

interface Clickables {
    void click();
}

interface Drawables {
    void draw();
}

class GraphicElements implements Clickables, Drawables {

    private String name;

    GraphicElements(String name) {
        this.name = name;
    }

    GraphicElements() {
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