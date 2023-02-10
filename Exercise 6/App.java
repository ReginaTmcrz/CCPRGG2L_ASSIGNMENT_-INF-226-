public class App {
    public static void main(String[] args) throws Exception {
       GroceryItem item1 = new Diaper();
       item1.name = "Mommypoko";
       item1.price = 1000;
       item1.showItemName();
    
       GroceryItem item2 = new Coffee();
       item2.name = "Yuban";
       item2.price = 1500;
       item2.showItemName();

       System.out.println();       

       Cashier c1 = new Cashier();
       c1.checkOut(item1);
       c1.showItemPrice(item1);

       c1.checkOut(item2);
       c1.showItemPrice(item2);

       GroceryItem[] itemArray = new GroceryItem[2];
       itemArray[0] = item1;
       itemArray[1] = item2;
       System.out.println();
       
       int total = 0;
       for (int i = 0; i < itemArray.length; i++){
        itemArray[i].showItemPrice();
        total += itemArray[i].price;
    
       }
       System.out.println();
       System.out.println("Total: " + total);

    
       Cat myCat = new Cat();
       myCat.eat();

       System.out.println();
       Chicken myChicken = new Chicken();
       myChicken.walk();
       myChicken.run();

    }
}
