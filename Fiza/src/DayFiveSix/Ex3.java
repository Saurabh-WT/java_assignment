package DayFiveSix;
class Book{
    int pages;
    String name;
    int prize;
    Book(int pages, String name, int prize){
        this.pages=pages;
        this.name=name;
        this.prize=prize;
    }
    void print(){
        System.out.println("Pages = "+pages+", name = "+", prize = "+prize);
    }
}
public class Ex3 {
    public static void main(String[] args) {
        Book b = new Book(100, "Science", 500);
        b.print();
    }
}
