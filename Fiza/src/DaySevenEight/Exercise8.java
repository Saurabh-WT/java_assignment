package DaySevenEight;
//Exercise 8: Multiple Interfaces
//Build a Java program that demonstrates a class implementing multiple interfaces. Create interfaces for "Drawable" and "Clickable"
// with corresponding methods. Implement these interfaces in a class representing graphical elements.
public class Exercise8 {
    public static void main(String[] args) {
        GraphicalElements g = new GraphicalElements();
        g.draw("image");
        g.click("logo");

    }
}
interface Drawable{
    void draw(String image);

}
interface Clickable{
    void click(String logo);
}
class GraphicalElements implements Drawable, Clickable{


    @Override
    public void draw(String image) {
        System.out.println(image+" is drawable element");
    }

    @Override
    public void click(String logo) {
        System.out.println(logo+" is clickable element");

    }
}
