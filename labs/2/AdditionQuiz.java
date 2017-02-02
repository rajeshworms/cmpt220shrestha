import java.util.Scanner;

public class AdditionQuiz {
	public static void main(String[] args) {
		
		//Generating random values
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 7 % 10);
		int number3 = (int)(System.currentTimeMillis() / 5 % 10);

 
		//Creating scanner object to take data
		Scanner input = new Scanner(System.in);
		
		//Question for the user
		System.out.print( "What is " + number1 + " + " + number2 + " + " + number3 +"? ");
		
		//Taking user input
		int answer = input.nextInt();
		
		//Displaying final Data
		System.out.println( number1 + " + " + number2 + " + " + number3 
				+" = " + answer + " is " + (number1 + number2 + number3 == answer));
 }
 }