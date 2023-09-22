public class ExerSix {
    //Develop a Java class called "BookItem" that represents a book in a library catalog. Include attributes like title, author, and ISBN.
    // Implement a parameterized constructor to initialize these attributes. Create multiple "BookItem" objects.
    public static void main(String[] args) {

        try {
            /// Similar to Book class
            // creating object with constructor overloading
            BookItem book1 = new BookItem();
            BookItem book2 = new BookItem("Harry Potter", "J.K. Rowling", "ES21734");
            BookItem book3 = new BookItem("The Subtle Art of not giving a F**k", "Mark Mansion");
            BookItem book4 = new BookItem("Atomic Habits");

            //setting all remaining values
            book1.setTitle("Zero to One");
            book1.setAuthor("Blake Masters and Peter Thiel");
            book1.setISBN("ED731441");
            book3.setISBN("HR388104");
            book4.setAuthor("James Clear");
            book4.setISBN("HFJ87866");

            //Showing book data using void type return type
            book2.show();
            book3.show();
            book4.show();
            book1.show();


        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}

class BookItem{
    String title;
    String author;
    String ISBN;
    BookItem(String title, String author, String isbn){
        this.author=author;
        this.title=title;
        this.ISBN=isbn;
    }
    BookItem(String title, String author){
        this.author=author;
        this.title=title;
    }
    BookItem(String title){
        this.title=title;
    }
    BookItem(){}

    void setTitle(String title){

        this.title=title;

    }
    void setAuthor(String author){
        this.author=author;

    }
    void setISBN(String isbn){
        this.ISBN=isbn;
    }
    void show(){
        System.out.println(" Title: "+ this.title+" Author: "+this.author+ " ISBN: "+this.ISBN);
    }

}