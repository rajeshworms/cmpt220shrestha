package Problem_13_5;
class Rectangle extends GeometricObject{
    private double width;
    private double height;

    //constructor with parameter
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    //returns area
    public double getArea() {
        return width * height;
    }
}