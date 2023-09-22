public class PracticeFour {
    //Q.  Implement a Java class named "Calculator" with overloaded methods to perform addition,
    // subtraction, multiplication, and division of numbers.
    // Test the methods with different argument types.
    public static void main(String[] args) {
        try {
            Calculator cal = new Calculator(); // Instantiating a new cal object from Calculator Class

            System.out.println("Addition overloaded method");
            System.out.println(cal.add(10, 20));
            System.out.println(cal.add(10.1f, 15));
            System.out.println(cal.add(67, 15.2f));
            System.out.println(cal.add(33.7f, 5.5f));
            System.out.println();

            System.out.println("Subtraction overloaded method");
            System.out.println(cal.subt(20, 5));
            System.out.println(cal.subt(20, 19.2f));
            System.out.println(cal.subt(16.2f, 5));
            System.out.println(cal.subt(28.5f, 77.6f));
            System.out.println();

            System.out.println("Multiplication overloaded method");
            System.out.println(cal.mult(10, 20));
            System.out.println(cal.mult(9.88f, 7));
            System.out.println(cal.mult(65, 88.546f));
            System.out.println(cal.mult(96.434f, 20.884f));
            System.out.println();

            System.out.println("Division overloaded method");
            System.out.println(cal.div(100, 20));
            System.out.println(cal.div(96.6f, 5));
            System.out.println(cal.div(5000, 76.55f));
            System.out.println(cal.div(8935.845f, 5743.434f));
            System.out.println();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Calculator {

    public int add(int x, int y) {
        return (x + y);
    }

    public float add(float x, int y) {
        return (x + (float) y);
    }

    public float add(float x, float y) {
        return (x + y);
    }

    public float add(int x, float y) {
        return ((float) x + y);
    }

    public int subt(int x, int y) {
        return (x - y);
    }

    public float subt(float x, int y) {
        return (x - (float) y);
    }

    public float subt(float x, float y) {
        return (x - y);
    }

    public float subt(int x, float y) {
        return ((float) x - y);
    }


    public int mult(int x, int y) {
        return x * y;
    }

    public float mult(float x, int y) {
        return (x * (float) y);
    }

    public float mult(float x, float y) {
        return (x * y);
    }

    public float mult(int x, float y) {
        return ((float) x * y);
    }


    public float div(int x, int y) {
        return (float) x / (float) y;
    }

    public float div(float x, int y) {
        return (x / (float) y);
    }

    public float div(float x, float y) {
        return (x / y);
    }

    public float div(int x, float y) {
        return ((float) x / y);
    }

}