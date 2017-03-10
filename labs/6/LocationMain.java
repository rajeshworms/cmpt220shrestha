import java.util.Scanner;

public class LocationMain {
    public static void main(String[] args) {
    	
    	//To set the array size and the values
        int[] arrayLength = getArrayLength();
        double[][] array = getArrayValues(arrayLength[0], arrayLength[1]);
        
        //Passing the array using Location object and displaying to user
        Location location = Location.locateLargest(array);
        System.out.println(location.properFormat());
    }
    
    //Method to get array size from the user
    private static int[] getArrayLength() {
        int[] length = new int[2];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        for (int i = 0; i < 2; i++) {
            length[i] = input.nextInt();
        }
        return length;
    }
    
    //Method to get array values from the user
    private static double[][] getArrayValues(int rows, int columns) {
        double[][] index = new double[rows][columns];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                index[i][j] = input.nextDouble();
            }
        }
        return index;
    }
}