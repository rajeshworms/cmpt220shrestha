public class ConvTable {
    public static void main(String[] args) {
    	//To display the top part
        System.out.println("Kilograms     Pounds    |   Pounds     Kilograms");
        
        //To display the table in proper format in loop
        for (int i = 1, j = 20; i < 200; i = i + 2, j = j + 5) {
            System.out.printf("%-10d%10.1f    |   %-10d%10.2f%n", i, i * 2.2, j, j / 2.2);
        }
    }
}