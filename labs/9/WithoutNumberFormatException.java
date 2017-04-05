public class WithoutNumberFormatException {
	/** Main method */
    public static void main(String[] args) {
        // Check number of strings passed
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }
        for (int i = 0; i < args.length; i += 2) {
            if (!checkifInteger(args[i])) {
                System.out.println("Wrong input: " + args[i]);
                System.exit(0);
            }
        }
        // The result of the operation
        int result = 0;
        // Determine the operator
        switch (args[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case '-':
                result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
            case '.':
                result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            case '/':
                result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
        }
        // Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }

    //Method to check if it is integer or not
    public static boolean checkifInteger(String s){
        StringBuilder string = new StringBuilder(s);
        if (string.charAt(0) == '-'){
        	string.deleteCharAt(0);
        }
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if (!Character.isDigit(currentChar)) return false;
        }
        return true;
    }
}