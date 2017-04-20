package Problem_13_5;

public class GeometricObjectComparableMain {
    public static void main(String[] args) {
    	//Creating objects of Circle class
    	Circle circle1 = new Circle(Math.random() * 10);
        Circle circle2 = new Circle(Math.random() * 10);

        //Creating objects of Rectangle class
        Rectangle rectangle1 = new Rectangle(Math.random() * 10, Math.random() * 10);
        Rectangle rectangle2 = new Rectangle(Math.random() * 10, Math.random() * 10);
        
        //display the final data
        System.out.printf("Area of circle1 = %.3f%n", circle1.getArea());
        System.out.printf("Area of circle2 = %.3f%n", circle2.getArea());
        System.out.printf("Area of rectangle1 = %.3f%n", rectangle1.getArea());
        System.out.printf("Area of rectangle2 = %.3f%n", rectangle2.getArea());
        System.out.println();
        System.out.println((circle1 == GeometricObject.Max(circle1, circle2) ? "circle1" : "circle2") + " is the larger circle");
        System.out.println((rectangle1 == GeometricObject.Max(rectangle1, rectangle2) ?
                "rectangle1" : "rectangle2") + " is is the larger rectangle");
    }
}