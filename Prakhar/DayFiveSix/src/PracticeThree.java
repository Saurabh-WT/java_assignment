public class PracticeThree {
    //Q. Create a Java class called "Book" with attributes like title, author, and ISBN.
    // Implement both default and parameterized constructors to initialize these attributes.
    public static void main(String[] args) {
        try {
            Book book1 = new Book();
            Book book2 = new Book("Harry Potter", "J.K. Rowling", "ES21734");

            book1.setTitle("Zero to One");
            book1.setAuthor("Blake Masters and Peter Thiel");
            book1.setISBN("ED731441");

            book2.show();
            book1.show();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
class Book{
    String title;
    String author;
    String ISBN;
    Book(String title, String author, String isbn){
        this.author=author;
        this.title=title;
        this.ISBN=isbn;
    }
     Book(String title, String author){
        this.author=author;
        this.title=title;
    }
    Book(String title){
        this.title=title;
    }
     Book(){}

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