/***************************
This program takes a start time and time elapsed (both from user input) and produces the final time.
 (24 HOUR CLOCK VERSION)
**********************************************/

import java.util.Scanner;
public class HW2d {

   public static void main(String[] args) {


       //CONSTANTS:
       final int MIN_IN_HOUR = 60;
       final int HOURS_IN_DAY = 24; //for use with 24-hour clock
       final int HOURS_IN_HALF_DAY = 12; //for use with 12-hour clock
       //
       String startTime;
       int startHour;    //starting hour
       int startMin;     //starting min
       int elapsedHour;   //elapsed hours
       int elapsedMin;      //elapsed min
       int endHour;
       int endMin;
       String ampm; //specifies am/pm in final output

      
       System.out.print("Enter starting time in hours and minutes, separated by a space: ");
       //scan.useDelimiter(":");
       Scanner scanIn = new Scanner(System.in);
       startTime = scanIn.next();
       //scanIn.close();

       //change any ':' to 'space'
       Scanner scan = new Scanner(startTime);
       String startTimeInt = startTime.replace(":", " ");

       String startHourStr = scan.next(startTimeInt); //sets first int input as startHour
       startHour = Integer.parseInt(startHourStr);

       String startMinStr = scan.next(startTimeInt);   //sets second int input as startMin
       startMin = Integer.parseInt(startMinStr);

       startHour += startMin / MIN_IN_HOUR; //adds any hours contained in startMin input
       startMin %= MIN_IN_HOUR;   //fixes startMin if startMin > MIN_IN_HOUR


       System.out.print("Enter elapsed time in hours and minutes, separated by a space (if hours = 0, enter 0): ");
       String elapsedTime = scanIn.next();

       //change any ':' to 'space'
       String elapsedTimeInt = elapsedTime.replace(":", " ");
       String elapsedHourStr = scan.next(elapsedTimeInt);
       elapsedHour = Integer.parseInt(elapsedHourStr);
       String elapsedMinStr = scan.next(elapsedTimeInt);
       elapsedMin = Integer.parseInt(elapsedMinStr);
       elapsedHour += elapsedMin / MIN_IN_HOUR;
       elapsedMin %= MIN_IN_HOUR;
       //same deal as startHour and startMin

       scan.close();

       //set final time to 24 hr clock and print
       endHour = startHour + elapsedHour;
       endMin = startMin + elapsedMin;
       endHour += elapsedMin / HOURS_IN_DAY;
       endHour %= HOURS_IN_DAY;
       endMin %= MIN_IN_HOUR;

       System.out.print("(24hr) The time is now " + endHour + ":" + endMin + ".\n");

       //set final time to 12 hour clock and print

       if (endHour > HOURS_IN_HALF_DAY){
           endHour %= HOURS_IN_HALF_DAY;
           ampm = "pm";
       }
       else if (endHour == 0){
           endHour = 12;
           ampm = "am";
       }
       else if (endHour == 12){
           ampm = "pm";
       }
       else ampm = "am";

       System.out.print("(12hr) The time is now " + endHour + ":" + endMin + " " + ampm + ".\n");


   }
}