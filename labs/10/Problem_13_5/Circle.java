package Problem_13_5;
class Circle extends GeometricObject{
    private double radius;

    //construtor with parameter
    Circle(double radius) {
        this.radius = radius;
    }

    //returns area
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
