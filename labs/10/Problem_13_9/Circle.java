package Problem_13_9;

class Circle extends GeometricObject implements Comparable<Circle>{
    private double radius;

    //No arg Constructor
    public Circle() {
    }

    //constructor with parameter
    public Circle(double radius) {
        this.radius = radius;
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Return area */
    @Override 
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    /** Return perimeter */
    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /** Print the circle info */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is " + radius);
    }

    //Method to compare the circles
    @Override
    public int compareTo(Circle o) {
        if (this.equals(o)) {
            return 0;
        } else if (this.radius > o.radius) {
            return 1;
        } else {
            return -1;
        }
    }

    //method to check if they are equa
    @Override
    public boolean equals(Object o){
        return o instanceof Circle && this.radius == ((Circle) o).radius;
    }
}