	public class Triangle extends GeometricObject{
	//Three sides of triangle with default values
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;

    //No arg constructor passing 1.0 as sides
    public Triangle() {
        this(1.0, 1.0, 1.0);
    }

    //Constructor with paramerter
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //returns side1
    public double getSide1() {
        return side1;
    }

    //returns side2
    public double getSide2() {
        return side2;
    }

    //returns side3
    public double getSide3() {
        return side3;
    }

    //returns area
    public double getArea() {
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    //returns parameter
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    //returns string description of triangle
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                " side3 = " + side3;
    }
}