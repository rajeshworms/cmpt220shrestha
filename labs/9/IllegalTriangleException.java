public class IllegalTriangleException extends Exception {
	
	//throws the error message when condition is met
	public IllegalTriangleException(double side1, double side2, double side3) {
		System.out.println("Error: Illegal Triangle side");
	}
}