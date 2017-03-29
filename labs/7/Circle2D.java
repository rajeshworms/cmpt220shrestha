
public class Circle2D {
        private final double x;
        private final double y;
        private final double radius;

        //Default constructor 
        Circle2D() {
            this(0, 0, 1);
        }

        //Constructor for specified size
        Circle2D(double x, double y, double radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }

        //Returns X
        double getX() {
            return x;
        }

        //Returns Y
        double getY() {
            return y;
        }

        //Returns radius
        double getRadius() {
            return radius;
        }

        //Returns area
        double getArea() {
            return Math.PI * radius * radius;
        }

        //Returns perimeter
        double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        //returns if whether a point is inside or not
        boolean contains(double x, double y) {
            return distance(x, y) < radius;
        }
        
        //returns if the circle is inside or not
        boolean contains(Circle2D circle) {
            return distance(circle.x, circle.y) <= Math.abs(radius - circle.radius);
        }
        
        //returns if it overlaps or not
        boolean overlaps(Circle2D circle) {
            return distance(circle.x, circle.y) <= radius + circle.radius && !contains(circle);
        }

        //Returns distance
        double distance(double x, double y) {
            return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        }
    }