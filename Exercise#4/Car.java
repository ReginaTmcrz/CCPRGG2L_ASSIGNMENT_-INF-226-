public class Car {
    
    String brand; 
    String color;
    int year;
    double price;
    Person owner; 

    Car (String carBrand,  String carColor, int carYear, double price, Person ownerName){
        this.brand = carBrand;
        this.color = carColor;
        this.year = carYear;
        this.price = price;
        this.owner = ownerName;
    }

    void showOwner(Person ownerName){
        System.out.println("Brand:  " + this.brand + "\n" + "My owner is:  " + ownerName.name);
        System.out.println("Color: " + this.color);
        System.out.println("Year: " + this.year);
        System.out.println("Price: $" + this.price);
    }


}
