import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        int number = getIntegers();
        StackOfIntegers factors = getFactors(number);
        displayFactors(factors);
    }

    //Displays the factors to the user
    private static void displayFactors(StackOfIntegers factors) {
        System.out.print(factors.pop());
        while (factors.getSize() > 0) {
            System.out.printf(", %d", factors.pop());
        }
    }

    //Gets input from the user
    public static int getIntegers() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Integer: ");
        return input.nextInt();
    }

    //Gets the factors of the input 
    public static StackOfIntegers getFactors(int number) {
        StackOfIntegers stackOfIntegers = new StackOfIntegers();
        while(number > 1){
            int i = 2;
            while (number % i != 0) i++;
            stackOfIntegers.push(i);
            number /= i;
        }
        return stackOfIntegers;
    }
}