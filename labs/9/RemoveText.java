import java.util.*;
import java.io.*;
	
public class RemoveText{
	public static void main(String[] args) {

        //Creating File class object
        File filename = new File(args[1]);
        //Message to display when a file is not found
        if (!filename.exists()) {
            System.out.println(args[1] + " does not exist.");
            System.out.println(2);
        }

        //Message to display when user inputs incorrectly
        if (args.length != 2) {
            System.out.println("Invalid arguments.");
            System.out.println("Usage: java Chapter_12.Exercise_11 word filename");
            System.exit(1);
        }
        
       
        String s = "";
        //Try-catch block to handle exception while reading data from file
        try {
            Scanner input = new Scanner(filename);
            while (input.hasNext()) {
                s += input.nextLine(); //Stores the read data
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String save = args[0];
        s = s.replaceAll(args[0], ""); //replaces all the value that matches with args[0]
        
        //Try-catch block to handle exception while Writing data to file
        try {
            PrintWriter output = new PrintWriter(filename);
            System.out.println("Your request has been completed the word \"" + save + "\" is now removed from the file." );
            output.write(s);
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

       
    }
}