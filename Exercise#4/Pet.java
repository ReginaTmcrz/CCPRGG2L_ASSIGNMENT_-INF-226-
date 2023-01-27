public class Pet {

    String name; 
    int age; 
    Person owner; 

     

    Pet (String PetName, int PetAge, Person ownerName){
        this.name = PetName;
        this.age = PetAge;
        this.owner = ownerName;
    }

    void showOwner(Person owner){
        System.out.println("My name is " + this.name + ", my owner is " + owner.name);
    }
    
}
