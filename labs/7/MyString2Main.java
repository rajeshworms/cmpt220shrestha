import java.util.Arrays;

public class MyString2Main {
    public static void main(String[] args) {
        MyString2 string1 = new MyString2("Rajeshwor Madhab Shrestha");
        MyString2 string2 = MyString2.valueOf(true);
        
        // print string
        System.out.print("string1 = ");
        printString(string1);
        System.out.println();

        //print compare string
        System.out.println("string1.compare(\"Rajeshwor\") = " + string1.compare("Rajeshwor Madhab"));
        System.out.println("string2.compare(\"true\") = " + string2.compare("True"));
        System.out.println("string1.compare(\"Rajeshwor\") = " + string1.compare("Rajeshwor Shrestha"));


        // print substring
        System.out.print("string1.substring(9) = ");
        printString(string1.substring(9));
        System.out.println();

        //print toUppercase
        System.out.print("string1.toUpperCase() = ");
        printString(string1.toUpperCase());
        System.out.println();
        System.out.print("string2.toUpperCase() = ");
        printString(string2.toUpperCase());
        System.out.println();

        //print toChars
        System.out.print("string1.toChars() = ");
        System.out.println(Arrays.toString(string1.toChars()));
        System.out.print("string2.toChars() = ");
        System.out.println(Arrays.toString(string2.toChars()));

        //print valueOf
        System.out.print("MyString2.valueOf(true) = ");
        printString(MyString2.valueOf(true));
        System.out.println();
        System.out.print("MyString2.valueOf(false) = ");
        printString(MyString2.valueOf(false));
        System.out.println();
    }

    private static void printString(MyString2 s) {
        for (int i = 0; i < s.toChars().length; i++) {
            System.out.print(s.toChars()[i]);
        }
    }
}