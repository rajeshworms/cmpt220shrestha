
public class RectangleMain {
    public static void main(String[] args) {
    	//Create first object for rectangle class
        Rectangle rectangle1 = new Rectangle(40, 4);
        //Create second object for rectangle class
        Rectangle rectangle2 = new Rectangle(35.9, 3.5);

        System.out.println("-Rectangle 1 data-");
        getData(rectangle1);
        System.out.println();
        System.out.println("-Rectangle 2 data-");
        getData(rectangle2);
    }

    //Method to call data for rectangles
    private static void getData(Rectangle rectangle) {
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter()); 
    }
}