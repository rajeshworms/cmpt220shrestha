import java.util.Scanner;

public class NumberFormatBin2Dec {
    public static void main(String[] args) {
    	//Creating scanner object to take input
    	Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = input.nextLine();
        int decNum = bin2Dec(binaryString);
        System.out.println(decNum);
    }

    //Method that converts binary to decimal and handles exception
    private static int bin2Dec(String binaryString) throws NumberFormatException {
        char binNum;
        int decNum = 0, power = 0;
        
        //Loop to throw exception
        for (char ch : binaryString.toCharArray()) {
            if (ch != '1' && ch != '0') throw new NumberFormatException("Not a binary number: " + binaryString);
        }
        
        //loop to convert binary to decimal
        for (int i = binaryString.length() - 1 ; i >= 0; i--) {
        	binNum = binaryString.charAt(i);
            if (binNum == '1') {
                decNum = decNum + ((int)((Math.pow(2, power) )));
            }
            power++;
            }
        return decNum;
    }
}