package DaySevenEight;

public class Exercise7 {
    public static void main(String[] args) {
        Resizable r = new Image(10,15);
        r.resize(15,20);
    }
}
interface Resizable{
    void resize(int width,int height);
}
class Image implements Resizable{
    int height;
    int width;
    Image(int height, int width){
        this.height=height;
        this.width=width;
    }

    @Override
    public void resize(int new_height, int new_width) {
        System.out.println("Old Height = "+height+", New Height = "+new_height+", Old Width = "+width+", New Width = "+new_width);

    }
}
class Window implements Resizable{
    int height;
    int width;
    Window(int height, int width){
        this.height=height;
        this.width=width;

    }

    @Override
    public void resize(int new_height, int new_width) {
        System.out.println("Old Height = "+height+", New Height = "+new_height+", Old Width = "+width+", New Width = "+new_width);

    }
}