import java.util.Scanner;

public class CharacterOccurence {
    private static int count = 0;

    public static void main(String[] args) {
        String string = getStringUserInput();
        char ch = getCharUserInput();
        System.out.println("Number of occurrences: " + count(string, ch));
    }
    
    //Method to get user input
    private static char getCharUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        return input.nextLine().charAt(0);
    }

    //Method to pass the values
    private static int count(String str, char a) {
        return count(str, a, str.length() - 1);
    }

    //Method to count occurrence
    private static int count(String str, char a, int high) {
        if (high < 0) return count;
        if (a == str.charAt(high)) {
            count++;
        }
        return count(str, a, high - 1);
    }

    //Method to get input from user
    private static String getStringUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return input.nextLine();
    }
}