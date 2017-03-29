
public class MyIntegerMain {
    public static void main(String[] args) {
    	//Creating MyInteger class object
        MyInteger num = new MyInteger(101);
        System.out.println("The value of num is " + num.getValue());
        System.out.println("Is num even? " + num.isEven());
        System.out.println("Is num odd? " + num.isOdd());
        System.out.println("Is num prime? " + num.isPrime());
        System.out.println("Does 101 equals 101? " + num.equals(101));
        System.out.println("Does 101 equals 201? " + num.equals(new MyInteger(201)));
        System.out.println("Parsing string \"123\" to int: " + MyInteger.parseInt("123"));
        System.out.println("Parsing char 2, 3 and 4 to int: "  + MyInteger.parseInt(new char[]{'2', '3', '4'}));
    }
}
