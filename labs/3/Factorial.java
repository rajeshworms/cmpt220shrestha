import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
    	//Creating scanner object
    	Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive Integer: ");
        int num = input.nextInt();
        
        //Looping for output
        while(num > 1){
            int i = 2;         
            while (num % i != 0){ 
            	i++;
            }
            System.out.print(i);
            if (num != i){ 
            	System.out.print(", ");
            }
            num /= i;               
        }
    }
}