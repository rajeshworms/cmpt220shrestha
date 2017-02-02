import java.util.Scanner;

public class ProcessingAString {
  public static void main(String[] args) {
  	
	 //Creating scanner object
    Scanner input = new Scanner(System.in);
    
    //Giving user directions and saving into variable
    System.out.print("Enter a string: ");
    String  getString = input.nextLine();
    
    //Displaying the length and character
    System.out.println("The length of the string is " + getString.length());
    System.out.println("The first character in the string is " + getString.charAt(0));    
  }
}
