import java.util.Random;
import java.util.Scanner;

public class ArrayOutOfBoundEx {
    public static void main(String[] args) {
        int[] array = getRandomIntegers(100);
        //Creating Scanner object for input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index of the array: ");
        int index = input.nextInt();
        //Try-catch block to catch the exception
        try {
            System.out.println(array[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error: Index" + ex.getMessage() + " is out of bounds");
        }
    }
    
    //Method to generate random integers of the array sizes
    private static int[] getRandomIntegers(int size) {
        int[] num = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            num[i] = random.nextInt();
        }
        return num;
    }
}