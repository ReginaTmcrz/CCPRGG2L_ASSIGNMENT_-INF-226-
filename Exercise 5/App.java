public class App {
    public static void main(String[] args) throws Exception {

        Person Me = new Person();


        Me.setName("regina");

        String myName = Me.getName();

        System.out.println("My name is " + myName);


        //INHERITANCE

        Daughter me = new Daughter();
        System.out.println(me.surname);
        me.showSurname();
        
    }
}
