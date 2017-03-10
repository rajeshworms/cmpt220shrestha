
public class Rectangle {
        private double width;
        private double height;
        
        //For default value of rectangle
        public Rectangle() {
            width = 1;
            height = 1;
        }
        
        //To set desired height and width
        public Rectangle(double height, double width) {
            this.height = height;
            this.width = width;
        }
        
        //Returns Width
        public double getWidth() {
            return width;
        }
        
        //Returns Height
        public double getHeight() {
            return height;
        }

        //To calculate area
        public double getArea() {
            return width * height;
        }
        
        //To calculate perimeter
        public double getPerimeter() {
            return width + width + height + height;
        }
    }
