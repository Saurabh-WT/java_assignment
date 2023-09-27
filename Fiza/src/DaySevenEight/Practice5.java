package DaySevenEight;
//Create a Java program that demonstrates a class implementing multiple
// interfaces with different methods. Showcase how the class fulfills the requirements of each interface.
public class Practice5 {
    public static void main(String[] args) {
         // creating object of class Operation
        Operation o = new Operation();
        o.cookie();
        o.noodles();
    }
}
interface Bake
{
    public abstract void cookie();
}
interface Cook
{
    public abstract void noodles();
}
class Operation implements Bake, Cook
{
    public void cookie()
    {
        System.out.println("This function is for baking cookies ");
    }
    public void noodles()
    {
        System.out.println("This function is for cooking noodles");
    }
}


