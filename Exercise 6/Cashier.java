import java.security.GeneralSecurityException;

public class Cashier {
    public void checkOut(GroceryItem item){
        System.out.println("You have purchased " + item.name);
    }

    public void showItemPrice(GroceryItem item){
        System.out.println("Price: " + item.price);

    
}
}