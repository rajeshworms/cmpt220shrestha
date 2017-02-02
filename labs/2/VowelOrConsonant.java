import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
    	//Creating scanner object
        Scanner input = new Scanner(System.in);
        
        //Giving user directions and saving into variable
        System.out.print("Enter a letter: ");
        char getLetter = input.nextLine().charAt(0);
        
        //To check if the user input is an alphabet or not
        if ((getLetter >= 'A' && getLetter <= 'Z')||(getLetter >= 'a' && getLetter <= 'z')  ){
        	
        	//To check if the input is vowel or not
            if (getLetter == 'A' || getLetter == 'E' || getLetter == 'I' || getLetter == 'O' 
            		|| getLetter == 'U' || getLetter == 'a' || getLetter == 'e' || getLetter == 'i' 
            		|| getLetter == 'o' || getLetter == 'u' ) {
            	
                System.out.println(getLetter + " is a vowel");
            } else {
            	
                System.out.println(getLetter + " is a consonant");
            }
        } else {
        	
            System.out.println(getLetter + " is an invalid input");
        }
    }
}