public class ExerciseSeven {
    //Exercise 7: Interface Implementation
    //Define a Java interface called "Resizable" with a method for resizing objects. Implement this interface in
    // classes for various resizable objects, such as images and windows.
    public static void main(String[] args) {
        System.out.println("Interface Implementation Example (Check the code)");

        System.out.println();
        Image img=new Image(100,100);
        System.out.print("Image before resize calling show method: ");
        img.show();
        img.resize(150,150);
        System.out.print("Image after resize calling show method: ");
        img.show();


        System.out.println();
        Window win = new Window(1080,720);
        System.out.print("Window before resize calling show method:  ");
        win.show();
        win.resize(720,512);
        System.out.print("Window after resize calling show method: ");
        win.show();

    }
}

interface Resizable{

    void resize(int height, int width);
    void show();
}

class Image implements Resizable{
    private int height;
    private int width;
    Image(int height, int width){
        this.height=height;
        this.width=width;
    }

    @Override
    public void resize(int height, int width) {
        this.height=height;
        this.width=width;
    }
    public void show(){
        System.out.println("The image of "+this.height+" X "+this.width+" is shown ");
    }
}
class Window implements Resizable{
    private int height;
    private int width;
    Window(int height, int width){
        this.height=height;
        this.width=width;
    }

    @Override
    public void resize(int height, int width) {
        this.height=height;
        this.width=width;
    }
    public void show(){
        System.out.println("The window of "+this.height+" X "+this.width+" is shown ");
    }
}
