import java.util.Scanner;

public class Problem2 {
	
public static void main(String[] args) {
	
	//Guide line for user
	System.out.print("Enter a degree in Celsius: ");
	
	//Input mechanism
	Scanner s = new Scanner(System.in);
	
	//Declaring input variable
	double ctemp = s.nextDouble();
	
	//Using formula
	double ftemp = (( 9 * ctemp ) / 5 )+ 32;
	
	//Displaying final value
	System.out.println(ctemp + " Celsius is " + ftemp + " Fahrenheit");
		
}
}
