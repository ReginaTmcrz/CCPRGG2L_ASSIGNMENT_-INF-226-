public class App {
    public static void main(String[] args) {

        Person me = new Person("Regina", 19);

        Person friend = new Person("Biancakes", 18);
        
        Person classmate1 = new Person("Biancakes", 18);
        
        Person classmate2 = new Person("Bia", 20);

        Person classmate3 = new Person("Chleo", 18);
        
        me.addFriend(friend);
        System.out.println();
        me.addClassmate(classmate1);
        me.addClassmate(classmate2);
        me.addClassmate(classmate3);



        //Composition there's a dependency
        
        System.out.println();
        Pet Dog = new Pet("Klar", 4, me);
        Dog.showOwner(me);
        
        System.out.println();
        Car car = new Car("Tesla", "White", 2022, 43000.00, me);
        car.showOwner(me);
    
        
        
    }
}
