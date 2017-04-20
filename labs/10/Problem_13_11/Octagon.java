package Problem_13_11;

class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable{
    double side = 1;

    //No arg constructor
    public Octagon() {
    }

    //Constructor with parameter
    public Octagon(double side) {
        this.side = side;
    }

    //returns side
    public double getSide() {
        return side;
    }

    //sets side
    public void setSide(double side) {
        this.side = side;
    }

    //returns area
    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 8;
    }

    //Method to compare
    @Override
    public int compareTo(Octagon o) {
        if (this.equals(o)) {
            return 0;
        } else if (this.side > o.side) {
            return 1;
        } else {
            return -1;
        }
    }

    //Method to check if one object equals to other object or not
    @Override
    public boolean equals(Object o){
        return o instanceof Octagon && this.side == ((Octagon)o).side;
    }

    //Method to clone the object
    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}