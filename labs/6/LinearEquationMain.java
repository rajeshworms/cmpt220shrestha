import java.util.Scanner;

public class LinearEquationMain {
    public static void main(String[] args) {
    	
    	//Passing the array values to LinearEquation object
        double[] index = getInput();
        LinearEquation linearEquation = new LinearEquation(index[0], index[1], index[2], index[3], index[4], index[5]);
        
        //Displaying final data
        if(linearEquation.isSolvable()){
        	System.out.printf("x is %.2f and y is %.2f", linearEquation.getX(), linearEquation.getY());
        } else {
        	System.out.printf("The equation has no solution.");
        }
    }
    
    //Method To get user input and store into array
    private static double[] getInput() {
        double[] numbers = new double[6];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        return numbers;
    }
  
}
