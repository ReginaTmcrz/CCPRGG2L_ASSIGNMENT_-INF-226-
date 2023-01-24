import java.util.Scanner;

import javax.xml.transform.Source;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        checkWeight(150);
        scan.close();
    }


    static void checkWeight(int Weight) {

        int currentWeight = getCurrentWeight(Weight);

      
        if (currentWeight < 150 ) {         
            fixWeight(currentWeight);
            checkWeight(Weight);
        } else if (currentWeight > 150) {
            fixWeight2(currentWeight);
          


        }else if(currentWeight == 150) {
           achieve();

        } 
    

    }


    static int getCurrentWeight(int Weight) {
        System.out.println();
        System.out.println("----- Weight Checker -----");
        System.out.println("Please Enter your weight: ");

        int currentWeight = scan.nextInt();

        return currentWeight;
    }



        //If the weight is less than 150
    static void fixWeight(int weight) {
        System.out.println();
        System.out.println("Weight must be more than 150lbs");

       
        
    }

    
         //If the weight is more than 150
    static void fixWeight2(int weight) {
    System.out.println();
    System.out.println("Fixing your diet!");
    System.out.print("Enter your weight loss:");
    int weightloss = scan.nextInt();
    int newWeight = weight - weightloss;


    if (newWeight < 150) {
    System.out.println();
    fixWeight(weight);
    System.out.println("You lost too much, try to gain weight again");
    System.out.println("You lost: " + weightloss + "lbs");
    System.out.println("Current Weight: " + newWeight + "lbs");
    checkWeight(newWeight);

    }else if (newWeight > 150) {
        System.out.println();
    System.out.println("Congrats! Your new weight is: " + newWeight + "lbs");
    System.out.println("You Lost: " + weightloss + " lbs");
    System.out.println("Target Weight: 150!" + "\n" + "Your current weight is " + newWeight + "lbs");
    fixWeight2(newWeight);
    
    System.out.println("");
    } else if (newWeight == 150) {
        achieve();
    }


}

    static void achieve() {
        System.out.println("Current Weight: 150");
       System.out.println("CONGRATULATIONS! You have reached your target weight!");
    }



}