
public class LinearEquation {
        private final double a;
        private final double b;
        private final double c;
        private final double d;
        private final double e;
        private final double f;
        
        //constructor to set values
        LinearEquation(double a, double b, double c, double d, double e, double f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
        
        //returns a
        double getA() {
            return a;
        }

        //returns b
        double getB() {
            return b;
        }

        //returns c
        double getC() {
            return c;
        }

        //returns d
        double getD() {
            return d;
        }

        //returns e
        double getE() {
            return e;
        }
        //returns f
        double getF() {
            return f;
        }
        
        //returns whether if the equation is solvable or not
        boolean isSolvable() {
            return a * d - b * c != 0;
        }
        
        //returns value of x
        double getX() {
            return (e * d - b * f) / (a * d - b * c);
        }
        
        //returns value of y
        double getY() {
            return (a * f - e * c) / (a * d - b * c);
        }
    }