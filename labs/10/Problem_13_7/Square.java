package Problem_13_7;

class Square extends GeometricObject implements Colorable{
    private double side;
    
    //constructor with arguement
    public Square(double side) {
        this.side = side;
    }

    //displays how to color
    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
    
    //returns area
    @Override
    public double getArea() {
        return side * side;
    }
}