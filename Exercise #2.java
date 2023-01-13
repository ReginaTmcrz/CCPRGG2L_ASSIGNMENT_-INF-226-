import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        drive("Student");
        scan.close();
    }

    static void drive(String student) {
        System.out.println("");
        System.out.println("Driving School Evaluation");
        Evaluating(student);

        String feedback = getFeedBack(student);
       

         // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
           addComments(feedback);

             //Recursive call
             
            drive(student);
      } else if (feedback.equals("yes")) {
            eval(feedback);
      }

        
    }



    static void Evaluating(String drive) {
        System.out.println("Evaluating Student");
    }

  
    static String getFeedBack(String drive) {
        System.out.println("");
        System.out.println("Is the " + drive + " a good driver? (Enter \"yes\" or \"no\")");
        String feedback = scan.next();
        return feedback;
    }

    static void addComments(String drive) {
        System.out.println("");
        System.out.print("Add recommendation:");
        String comments = scan.next();
        System.out.println("Adding Comments....");
        System.out.println("Added: " + comments);
        
        
    }

    static void eval(String drive) {
        System.out.println("Give the student a credit ");
    }

}