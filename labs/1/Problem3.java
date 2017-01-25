import java.util.Scanner;
 
public class Problem3 {
	
    public static void main (String[] args) {
    	
    	//Direction for the user
    	System.out.print("Enter the subtotal and a gratuity rate: ");
    	
    	//Creating scanner object
    	Scanner in = new Scanner(System.in);
    	
    	//Declaring variables
        double stotal = in.nextDouble();
        double rate = in.nextDouble();
        
        //Using the formula
        double grat = rate / 10;
        double total = stotal + grat;
         
        //Displaying results
        System.out.println("The gratuity is $" + grat + " and total is $" + total);
        
    }
}