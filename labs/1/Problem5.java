import java.util.Scanner;
 
public class Problem5 {
    public static void main (String[] args) {
    	
    	//Direction for the user
        System.out.print("Enter v0(in m/s), v1(in m/s) and t(in seconds): ");
    	
        //Creating scanner object to take data
        Scanner in = new Scanner(System.in);
         
        //Saving the user data in variable 
        double v0 = in.nextDouble();
        double v1 = in.nextDouble();
        double t = in.nextDouble();

        //Using the formula
        double avg = (v1 - v0) / t;
         
        //Displaying results
        System.out.println("The average acceleration is " + avg );
        
    }
}