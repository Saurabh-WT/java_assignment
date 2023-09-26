public class ExerciseFive {
//    Exercise 5: Encapsulation in Practice
//    Develop a Java class representing a library book with private fields for title, author, and ISBN. Implement
//    getter and setter methods to ensure encapsulation.
public static void main(String[] args) {

    try {

        BookItem book1 = new BookItem();

        //setting all remaining values
        book1.setTitle("Zero to One");
        book1.setAuthor("Blake Masters and Peter Thiel");
        book1.setISBN("ED731441");

        System.out.println(" Title: "+ book1.getTitle()+" Author: "+book1.getAuthor()+ " ISBN: "+book1.getISBN());


    }catch (Exception e){
        throw new RuntimeException(e);
    }
}
}

class BookItem{
    private String title;
    private String author;
    private String ISBN;


    void setTitle(String title){

        this.title=title;

    }
    void setAuthor(String author){
        this.author=author;

    }
    void setISBN(String isbn){
        this.ISBN=isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }
}