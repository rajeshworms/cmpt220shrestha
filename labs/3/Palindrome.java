import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
    	//Creating scanner object;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String s = "";
        int num = input.nextInt();
        boolean getValue= isPalindrome(num);
        
        //To add not if the integer in not a Palindrome
        if (!getValue){
              s = "not";	
        }
        System.out.println("The integer is " + s + " a palindrome");
    	}

     //To reverse the integer 
     public static int reverse(int number){
        int reverse = 0;
        while (number > 0){
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;
     }
     
    //To check the integer
    public static boolean isPalindrome(int number){
    	boolean check;
        check = number == reverse(number);
        return check;
    }
}