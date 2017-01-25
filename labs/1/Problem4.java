import java.util.Scanner;

public class Problem4 {
  public static void main(String[] args) {
	//Direction for the user
	System.out.print("Enter an integer between 0 and 1000: ");

	//creating scanner object to take data
    Scanner in = new Scanner(System.in);
    
    //Saving the user data in variable 
    int a = in.nextInt();

    //declaring variables
    int sum = 0;
    int remainder = 0;

    //Data storage
    int storage = a;
     
    //Finding the sum using loops
    while( a > 0 ){
    remainder = a % 10;
    a = a / 10;
    
    //Finding the sum of digits
    sum = sum + remainder;
    }
    
    // Display results		
    System.out.println("The sum of all digits in " + storage + " is " + sum);
  }
}
