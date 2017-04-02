import java.util.Scanner;

public class TriangleMain {
    public static void main(String[] args) {
        double[] sides = askSides(3);
        String color = askColor();
        boolean fill = askIfFilled();
        Triangle triangle = new Triangle(sides[0], sides[1], sides[2]);
        triangle.setColor(color);
        triangle.setFilled(fill);
        System.out.println("Area:  \t   " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: \t   " + triangle.getColor());
        System.out.println("Filled:\t   " + triangle.isFilled());
    }

    //Asks user its filled or not
    private static boolean askIfFilled() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter T if its filled or F if its not: ");
        boolean fill =  input.nextLine().toUpperCase().charAt(0) == 'T';
        return fill;
    }

    //Asks the user color of the triangle
    private static String askColor() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a color: ");
        String color =  input.nextLine();
        return color;
    }

    //Ask sides of triangle
    private static double[] askSides(int size) {
        double[] storeSides = new double[size];
        final Scanner input = new Scanner(System.in);
        System.out.print("Enter " + size + " sides: ");
        for (int i = 0; i < size; i++) {
            storeSides[i] = input.nextDouble();
        }
        return storeSides;
    }
}
