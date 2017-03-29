
  public class MyInteger {
        int value;
        
        MyInteger(int value) {
            this.value = value;
        }
        
        //Returns if it is even or not
        static boolean isEven(int value) {
            return value % 2 == 0;
        }

        //Returns if it is even or not
        static boolean isEven(MyInteger value) {
            return isEven(value.getValue());
        }

        //Returns if it is odd or not
        static boolean isOdd(int value) {
            return !isEven(value);
        }

        //Returns if it is odd or not
        static boolean isOdd(MyInteger value) {
            return isOdd(value.getValue());
        }

        //Returns if it is prime or not
        static boolean isPrime(int value) {
            for (int divisor = 2; divisor <= value / 2; divisor++) {
                if (value % divisor == 0) {
                    return false; 
                }
            }
            return true; 
        }
        
        //Returns if it is prime or not
        static boolean isPrime(MyInteger value) {
            return isPrime(value.getValue());
        }

        //Returns parsed value of char
        static int parseInt(char[] array) {
            int value = 0;
            for (int i = 0; i < array.length; i++) {
                value += (array[i] - '0') * Math.pow(10, array.length - i - 1);
            }
            return value;
        }

        //Returns parsed value of string
        static int parseInt(String value) {
            return Integer.parseInt(value);
        }
        //Returns value
        int getValue() {
            return value;
        }

        //Returns if it is even or not
        boolean isEven() {
            return isEven(value);
        }

        //Returns if it is odd or not
        boolean isOdd() {
            return isOdd(value);
        }

        //Returns if it is prime or not
        boolean isPrime() {
            return isPrime(value);
        }

        //Returns if it is equal or not
        boolean equals(int value) {
            return this.value == value;
        }

        //Returns if it is equal or not
        boolean equals(MyInteger value) {
            return equals(value.getValue());
        }
    }

