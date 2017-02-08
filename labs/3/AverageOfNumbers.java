import java.util.Scanner;

public class AverageOfNumbers {
	public static void main(String[] args) {
		
		//Creating scanner object
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int num, pos = 0 , neg = 0 ,  count = 0;
		double sum = 0, avg;
		
		//Looping for input
		do{
			num = input.nextInt();
			sum = sum + num;
			if(num > 0){
				pos++;
				count++;
			}else if(num < 0){
			neg++;
			count++;
			} else{
				count++;			
			}
	
		}while(num != 0);
		
		//Displaying final data
		if(count != 1){
		avg = sum / (pos + neg);
		System.out.println("The number of positives is " + pos);
		System.out.println("The number of negatives is " + neg);
		System.out.println("The total is " + sum );
		System.out.println("The average is " + avg);
		} else{
		System.out.println("No numbers are entered except 0");
		}
	}

}
