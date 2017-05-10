import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        int[] values = getMultipleUserInput(8);
        System.out.println(getLargestValue(values));
    }

    //Method to get user input
    private static int[] getMultipleUserInput(int size) {
        int[] values = new int[size];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter eight integers: ");
        for (int i = 0; i < size; i++) {
            values[i] = input.nextInt();
        }
        return values;
    }

    //Method to pass the value
    private static int getLargestValue(int[] values) {
        return getLargestValue(values, values.length - 1, Integer.MIN_VALUE);
    }

    //Method to find the largest value
    private static int getLargestValue(int[] values, int index, int max) {
        if (index < 0) return max;
        if (values[index] > max) max = values[index];
        return getLargestValue(values, index - 1, max);
    }
}