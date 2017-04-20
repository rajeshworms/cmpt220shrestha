package Problem_13_1;
import java.util.Scanner;

public class TriangleMain {
    public static void main(String[] args) {
    	//Creating Triangle class object
        Triangle triangle = createUserTriangle();
        System.out.println(triangle);
    }

    //Method to take the value from the user
    private static Triangle createUserTriangle() {
        double[] sides = promptDoubleValues(3);
        String color = promptStringValue("Enter the color: ");
        boolean isFilled = promptBooleanValue();
        Triangle triangle = new Triangle(sides[0], sides[1], sides[2]);
        triangle.setColor(color);
        triangle.setFilled(isFilled);
        return triangle;
    }

    //Asks user if filled or not
    private static boolean promptBooleanValue() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter [T]rue' for filled, or [F]alse for unfilled: ");
        return input.nextLine().toUpperCase().charAt(0) == 'T';
    }

    //Asks for color
    private static String promptStringValue(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        return input.nextLine();
    }

    //Asks for sides from the user
    private static double[] promptDoubleValues(int size) {
        double[] values = new double[size];
        boolean valid;
        do {
            valid = true;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter " + size + " sides: ");
            for (int i = 0; i < size; i++) {
                if (input.hasNextDouble()) {
                    values[i] = input.nextDouble();
                } else {
                    System.out.println("One or more of the input values is invalid.\nTry again.");
                    valid = false;
                    break;
                }
            }
        } while (!valid);
        return values;
    }
}