import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
    	
    	//Creating Scanner object
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("The greatest commond divider is: " + gcd(numbers));
    }
    
    // TO find the minimum value
    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }
    
    // To find out the greatest common divisor
    public static int gcd(int... numbers) {
        int min = min(numbers);
        for (int i = min; i > 0; i--) {
            boolean gcd = true;
            for (int number : numbers) {
                gcd = gcd && (number % i == 0);
            }
            if (gcd) return i;
        }
        return 1;
    }
}