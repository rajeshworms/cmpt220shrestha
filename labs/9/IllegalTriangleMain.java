
public class IllegalTriangleMain{
    public static void main(String[] args) throws IllegalTriangleException {
      Triangle triangle = new Triangle(2.0, 3.0, 7.0); //illegal Sided Triangle
      System.out.println(triangle.toString());
    }
}