import java.util.Scanner;

public class SumRecursion {
    public static void main(String[] args) {
        int number = getUserInput();
        System.out.println("The sum of digits: " + sumDigits(number));
    }

    //Method to pass value
    private static int sumDigits(long n) {
        return sumDigits(n, 0);
    }

    //Method to get sum of the digits in an integer
    private static int sumDigits(long n, int result) {
        if (n <= 0) {
            return result;
        } else {
            return sumDigits(n / 10, result + (int) (n % 10));
        }
    }

    //Method to take input from user
    private static int getUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (input.hasNextInt()) {
            return input.nextInt();
        }
        return 0;
    }
}