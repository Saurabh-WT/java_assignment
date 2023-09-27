package DaySevenEight;

public class Exercise5 {
    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Pilgrim's Progress", " John Bunyan", "3456236789432");
        LibraryBook b2 = new LibraryBook("Frankenstein", " Mary Shelley", "7694532719178");
        System.out.println(b1.getAuthor());
        System.out.println(b1.getTitle());
        System.out.println(b1.getISBN());
        b1.getInfo();
        b2.getInfo();

    }
}
class LibraryBook{
    private String title;
    private String author;
    private String ISBN;
    LibraryBook(String title, String author, String ISBN){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return  author;
    }
    public String getISBN(){
        return ISBN;
    }
    public void setTitle(String title){
        this.title=title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void getInfo(){
        System.out.println("Book title is = "+title+", author name is = "+author+", and ISBN number is= "+ISBN);
    }
}
