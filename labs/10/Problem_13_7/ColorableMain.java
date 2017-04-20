package Problem_13_7;

public class ColorableMain {
    public static void main(String[] args) {
    	//Creating GeometricObject class object
        GeometricObject[] shapes = generateShapesArray(5);
        displayShapeInfo(shapes);
    }

    //Displays the area area of the object and how to color
    private static void displayShapeInfo(GeometricObject[] shapes) {
        for (GeometricObject shape : shapes) {
            System.out.println(shape.getClass() + "\n   Area: " + shape.getArea());
            if (shape instanceof Colorable) {
                System.out.print("   ");
                ((Colorable) shape).howToColor();
            }
        }
    }
    
    //Generates shapes stores them in an array
    private static GeometricObject[] generateShapesArray(int size) {
        GeometricObject[] shapes = new GeometricObject[size];
        for (int i = 0; i <shapes.length ; i++) {
            if ((int) (Math.random() * 2) == 0) {
                shapes[i] = new Square(i + 1);
            } else {
                shapes[i] = new Circle(i + 1);
            }
        }
        return shapes;
    }
}