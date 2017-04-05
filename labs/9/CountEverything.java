import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountEverything {

    public static void main(String[] args) {
    	       
        //Creating File class object
        File filename = new File(args[0]);
        
        //Message to display when a file is not found
        if (!filename.exists()) {
            System.out.println("Error: The file" + filename + " does not exist.");
            System.exit(2);
        }

        //Message to display when user inputs incorrectly
        if (args.length != 1) {
            System.out.println("Error: Enter data properly(java CountEverything filename)");
            System.exit(1);
        }
        
        int characters = 0;
        int words = 0;
        int lines = 0;

        //Try-catch block to handle exceptions
        try {
            Scanner input = new Scanner(filename);
            //Loop to read data from the file
            while (input.hasNext()) {
                String string = input.nextLine();
                characters += string.length(); //Counts Characters
                String[] getSpaces = string.split(" "); //Counts words
                lines++; //Counts lines
                for (String word : getSpaces) {
                    words++;
                }
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        System.out.println("Characters: " + characters);
        System.out.println("Words: " + words);
        System.out.println("Lines: " + lines);


    }
}