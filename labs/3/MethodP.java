public class MethodP {
    public static void main(String[] args) {
        int count = 0;
        
        //Loop to print the numbers
        for (int i = 1; i <= 100; i++) {
            System.out.print(getPentagonalNumber(i) + "\t");
            count++;
            
            //To change to next line after every 10 numbers
            if (count == 10){
                System.out.println();
                count = 0;
            }
        }
    }

    //Creating the method
    public static int getPentagonalNumber(int n){
    	int num = n * (3 * n - 1) / 2;
        return num;
    }
}