public class Person {
    
    String name; 
    int age; 
    
    Person (String PersonName, int PersonAge){
        this.age = PersonAge;
        this.name = PersonName;


    }
     void addFriend(Person friend){
        System.out.println(this.name + " is friend with " + friend.name);

    }

    void addClassmate  (Person classmate) {

        System.out.println("Hi I am " + this.name + " I am classmate with " + classmate.name);
    
        

    }
}

    

