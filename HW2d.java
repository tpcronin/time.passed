/***************************
This program takes a start time and time elapsed (both from user input) and produces the final time.
 (24 HOUR CLOCK VERSION)
**********************************************/

import java.util.Scanner;
public class HW2d {

   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       //CONSTANTS:
       int MIN_IN_HOUR = 60;
       int HOURS_IN_DAY = 24;
       //
       int startHour;    //starting hour
       int startMin;     //starting min
       int elapsedHour;   //elapsed hours
       int elapsedMin;      //elapsed min
       int endHour;
       int endMin;
      
       System.out.print("Enter starting time in hours and minutes, separated by a space (if hours = 0, enter 0eg): ");
       startHour = in.nextInt(); //sets first int input as startHour
       startMin = in.nextInt();   //sets second int input as startMin
       startHour += startMin / MIN_IN_HOUR; //adds any hours contained in startMin input
       startMin %= MIN_IN_HOUR;   //fixes startMin if startMin > MIN_IN_HOUR

       System.out.print("Enter elapsed time in hours and minutes, separated by a space (if hours = 0, enter 0): ");
       elapsedHour = in.nextInt();
       elapsedMin = in.nextInt();
       elapsedHour += elapsedMin / MIN_IN_HOUR;
       elapsedMin %= MIN_IN_HOUR;
       //same deal as startHour and startMin

       endHour = startHour + elapsedHour;
       endMin = startMin + elapsedMin;
       endHour += elapsedMin / HOURS_IN_DAY;
       endHour %= HOURS_IN_DAY;
       endMin %= MIN_IN_HOUR;

       System.out.print("The time is now " + endHour + ":" + endMin);


   }
}