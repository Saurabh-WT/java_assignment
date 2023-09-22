
public class ExerThree {
//    Enhance the "Book" class from the module by adding a parameterized constructor that allows
//     you to set the book's attributes during object creation.
//     Create a "Book" object using the parameterized constructor.
    public static void main(String[] args) {
        try {
            // Note:-    Book class is in PracticeThree.java

            Book book1 = new Book("Harry Potter", "J.K. Rowling", "ES21734");
            book1.show();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
