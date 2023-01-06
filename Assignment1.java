
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner; 


public class Project {
    public static void main(String[] args) {



        System.out.println("---------------------- Student Information ------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student email: ");
        String studentEmail = scan.nextLine();


        Pattern pattern = Pattern.compile("\\w{1,}@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentEmail);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid student Email");
        } else {
            System.out.println("invalid student Email: " + studentEmail);
        }


        System.out.println("");

         //NUMBER
     
         System.out.print("Enter student number: ");
         String studentNumber = scan.nextLine();
 
         Pattern patterns = Pattern.compile("\\+639\\d{9}");
         Matcher matchers = pattern.matcher(studentNumber);
 
         if (match) {
             System.out.println("valid student number" );
         } else {
             System.out.println("invalid student number: " + studentNumber);
         }


         System.out.println("");


         //BIRTHDAY
  
            System.out.print("Enter student birhtday: ");
            String studentbirthday = scan.nextLine();

            Pattern pattern1 = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
            Matcher matcher1 = pattern.matcher(studentbirthday);


            if (match) {
                System.out.println("valid student birthday");
            } else {
                System.out.println("invalid input");
            }
                
                    
 

        
        
        
    }
}