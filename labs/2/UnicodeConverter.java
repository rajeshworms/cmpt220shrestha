import java.util.Scanner;

public class UnicodeConverter {
    public static void main(String[] args) {
    	
    	//Creating scanner object
        Scanner input = new Scanner(System.in);
        
        //Giving user directions and saving into variable
        System.out.print("Enter a character: ");
        
        //Getting the first value from the string in case multiple character are entered
        char getLetter = input.nextLine().charAt(0);
        int convert = getLetter;
        
        System.out.println("The Unicode for the character " + getLetter + " is " + convert);
    }
}