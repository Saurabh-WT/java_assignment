package DayFiveSix;
class BookItem{
    String title;
    String author;
    String ISBN;
    BookItem(String title, String author, String ISBN){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
    }
    public void displayBookInfo(){
        System.out.print("Title = "+title);
        System.out.print(", Author = "+author);
        System.out.print(", ISBN = "+ISBN);
        System.out.println();
    }

}
public class Ex6 {
    public static void main(String[] args) {
        BookItem b1 = new BookItem("Science","author1", "2546783456213");
        BookItem b2 = new BookItem("Maths", "author2", "3456721345678");
        b1.displayBookInfo();
        b2.displayBookInfo();
    }

}
