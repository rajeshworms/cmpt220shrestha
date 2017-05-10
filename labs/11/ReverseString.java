import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String string = getUserInput();
        reverseDisplay(string);
    }

    //Method to pass value
    private static void reverseDisplay(String value) {
        reverseDisplay(value, value.length() - 1);
    }

    //Method to reverse the string
    private static void reverseDisplay(String value, int index) {
        if (index == 0) {
            System.out.print(value.charAt(0));
        } else {
            System.out.print(value.charAt(index));
            reverseDisplay(value, index - 1);
        }
    }
    
    //Method to take input from the user
    private static String getUserInput() {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return input.nextLine();
    }
}