import java.util.*;

public class PerfectSquare {
    public static void main(String[] args) {
    	int m = getInput();
        ArrayList<Integer> factors = getFactors(m);
        ArrayList<Integer> oddCountFactors = getOddCountFactors(factors);
        int n = product(oddCountFactors);
        System.out.println("The smallest number n for m * n to be a perfect square is " + n);
        System.out.println("m * n is " + (m * n));
    }

    //Method to calculate the product of odd factors
    private static int product(ArrayList<Integer> oddFactors) {
        int n = 1;
        for (Integer oddFactor : oddFactors) {
            n = n * oddFactor;
        }
        return n;
    }

    //method to count the number of odd factors of the value
    private static ArrayList<Integer> getOddCountFactors(ArrayList<Integer> factors) {
        ArrayList<Integer> oddFactors = new ArrayList<>();
        for (Integer factor : factors) {
            int count = 0;
            for (Integer integer : factors) {
                if (integer.equals(factor)) count++;
            }
            if (count % 2 == 1 && !oddFactors.contains(factor)) oddFactors.add(factor);
        }
        return oddFactors;
    }

    //Method to get factors for the entered value
    public static ArrayList<Integer> getFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        while(number > 1){
            int i = 2;
            while (number % i != 0) i++;
            factors.add(i);
            number /= i;
        }
        return factors;
    }

    //Method to get input from user
    public static int getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer m: ");
        return input.nextInt();
    }
}