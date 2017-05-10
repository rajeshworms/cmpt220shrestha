import java.util.Scanner;

public class CharacterOccurenceArray {
    public static void main(String[] args) {
        char[] chars = getCharArrayInput();
        char ch = getCharInput();
        System.out.println("The count is: " + count(chars, ch));
    }

    //Method to pass the value
    private static int count(char[] chars, char ch) {
        return count(chars, ch, chars.length - 1);
    }

    //Method to count the occurrence in an array
    private static int count(char[] chars, char ch, int high) {
        int count = chars[high] == ch ? 1 : 0;
        if (high == 0) return count;
        return count + count(chars, ch, high - 1);
    }

    //Method to get array of characters from user
    private static char[] getCharArrayInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter characters: ");
        return input.nextLine().toCharArray();
    }

    //Method to get char Input
    private static char getCharInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        return input.nextLine().charAt(0);
    }
}