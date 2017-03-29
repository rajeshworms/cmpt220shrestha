import java.math.BigInteger;

public class GreaterThanLong {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger(Long.toString(Long.MAX_VALUE)).add(BigInteger.ONE);
        System.out.println("Max long value = " + Long.MAX_VALUE);
        printNumbers(bigInteger, 10);
    }

    //Method to print the numbers divisible by 5 or 6
    private static void printNumbers(BigInteger start, int quantity) {
        int count = 0;
        BigInteger five = new BigInteger("5");
        BigInteger six = new BigInteger("6");
        System.out.println("Numbers divisible by 5 or 6 are:");
        while (count < quantity) {
            if (start.mod(five).equals(BigInteger.ZERO) || start.mod(six).equals(BigInteger.ZERO)) {
                System.out.print(start.toString());
                count++;
                System.out.println();
            }
            start = start.add(BigInteger.ONE);
        }
    }
}