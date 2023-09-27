package DaySevenEight;

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
