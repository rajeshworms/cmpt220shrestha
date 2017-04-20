package Problem_13_7;

class Circle extends GeometricObject{
    private double radius;

    //constructor with argument
    public Circle(double radius) {
        this.radius = radius;
    }

    //returns area
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
