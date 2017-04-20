package Problem_13_9;

public class CircleComparable {
    public static void main(String[] args) {
    	//Creating Circle class objects
        Circle circle1 = new Circle(4);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(5);
        Circle circle4 = new Circle(6);

        //Display the final result
        System.out.println("circle1.compareTo(circle2) = " + circle1.compareTo(circle2));
        System.out.println("circle2.compareTo(circle3) = " + circle2.compareTo(circle3));
        System.out.println("circle3.compareTo(circle4) = " + circle3.compareTo(circle4));
        System.out.println("circle4.compareTo(circle1) = " + circle4.compareTo(circle1));
    }
}
