import java.util.Scanner;
 
public class FindingFutureDatess {
    public static void main(String[] args) {
    	//Variables to save the day
        String todaysDate = "";
        String futureDate = "";
         
        //Creating scanner object
        Scanner input = new Scanner( System.in );
        
        //Giving user directions and taking input
        System.out.print( "Enter today's day: " );
        int getTodaysDate = input.nextInt();
        System.out.print( "Enter the number of days elapsed since today: " );
        int getFuturesDate = input.nextInt();
        
        //In case user enters value more than 6
        if(getTodaysDate > 6){
        	getTodaysDate = getTodaysDate % 7;
        }
              
        //Using formula to get appropriate date for future
        int forFutureDate = (getTodaysDate + getFuturesDate) % 7;
      
        //To get the todays day
        switch (getTodaysDate) {
        case 0:
            todaysDate = "Sunday";
            break;
        case 1:
            todaysDate = "Monday";
            break;
        case 2:
            todaysDate = "Tuesday";
            break;
        case 3:
            todaysDate = "Wednesday";
            break;
        case 4:
            todaysDate = "Thursday";
            break;
        case 5:
            todaysDate = "Friday";
            break;
        case 6:
            todaysDate = "Saturday";
            break;
        default:
            System.err.println(getTodaysDate + " is innvalid data");
    }
        
        //To get future date
        switch (forFutureDate) {
        case 0:
            futureDate = "Sunday";
            break;
        case 1:
            futureDate = "Monday";
            break;
        case 2:
            futureDate = "Tuesday";
            break;
        case 3:
            futureDate = "Wednesday";
            break;
        case 4:
            futureDate = "Thursday";
            break;
        case 5:
            futureDate = "Friday";
            break;
        case 6:
            futureDate = "Saturday";
            break;
        default:
            System.err.println( getFuturesDate + " is invalid data" );
    }
 
        System.out.println("Today is " + todaysDate + " and the future day is " + futureDate);
    }
}
