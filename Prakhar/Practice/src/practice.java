import java.util.ArrayList;
import java.util.Date;

public class practice {
    //Main Class (ShoppingSystem):
    //Create Product objects.
    //Add products to the cart.
    //Display the cart.
    //Complete the purchase.
    //Display purchase details.
    public static void main(String[] args) {
        Product prod1=new Product();
        prod1.setProductDetails("Toothpaste",200.0);
        Product prod2=new Product();
        prod2.setProductDetails("Pizza",1000.0);

        ShoppingCart cart= new ShoppingCart();
        cart.addToCart(prod1);
        cart.addToCart(prod2);
        cart.displayCart();
        System.out.println("Total: "+cart.calculateTotal());

        //
        Purchase purch = new Purchase();
        purch.setItem(cart.getItems());
//        String time = String.valueOf(new Date().getTime());
//        System.out.println(new Date());
        purch.setPurchaseDate( String.valueOf(new Date()));
        purch.displayPurchaseDetails();


    }
}

class Product {
    private String productName;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setProductDetails(String name, double price) {
        this.productName = name;
        this.price = price;
    }


    public void getProductDetails() {
        System.out.println("Name: " + productName + " Price: " + price);
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}

class ShoppingCart {
    static ArrayList<Product> cartItems = new ArrayList<>();

    ShoppingCart (){}

    public ShoppingCart(Product product) {
        cartItems.add(product);
    }

    public void addToCart(Product product) {
        cartItems.add(product);
    }

    double calculateTotal() {
        double totalPrice = 0;
        for (Product product : cartItems) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
    public ArrayList<Product> getItems(){
        return cartItems;
    }

    void displayCart() {
        System.out.println("\n----------Product List--------------");
        for (Product product : cartItems) {
            product.getProductDetails();
        }

    }
}

class Purchase {
    private String purchaseDate;
    static ArrayList<Product> items = new ArrayList<>();

    public void setPurchaseDate(String date) {
        this.purchaseDate = date;
    }

    public void setItem(ArrayList<Product> list){

        this.items=list;
    }

    void getItems() {
        System.out.println("\n----------Product List--------------");
        for (Product product : items) {
            product.getProductDetails();
        }
    }

    void displayPurchaseDetails() {
        System.out.println("\n----------Purchase list------");
        double totalPrice=0;
        System.out.println("Purchase Time: "+purchaseDate);
        for (Product product : items) {
            product.getProductDetails();
            totalPrice+=product.getPrice();
        }
        System.out.println("Total Price: "+totalPrice);
   }
}

//Develop a Java program for a basic shopping system using classes. Create classes for Product, ShoppingCart, and
// Purchase. Implement methods within the Product class for setting and getting product details, ShoppingCart class
// for adding products, calculating the total, and displaying the items in the cart. The system should allow
// customers to add items to the cart, view the cart, and complete the purchase.
//Details -
//
//Classes:
//
//Product:
//Variables: productName (String), price (double).
//Methods: setProductDetails(String name, double price), getProductDetails().
//ShoppingCart:
//ArrayList<Product> named cartItems.
//Methods: addToCart(Product product), calculateTotal(), displayCart().
//Purchase:
//Variables: purchaseDate (String), items (ArrayList<Product>).
//Methods: setPurchaseDate(String date), getItems(), displayPurchaseDetails().
//Main Class (ShoppingSystem):
//Create Product objects.
//Add products to the cart.
//Display the cart.
//Complete the purchase.
//Display purchase details.