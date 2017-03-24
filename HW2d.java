/***************************
This program takes a start time and time elapsed (both from user input) and produces the final time.
 (24 HOUR CLOCK VERSION)
**********************************************/


import java.text.DecimalFormat;
import java.util.Scanner;

public class HW2d {


     static hourMinInput getTimeUser()
     {
         String hourString = "";
         String minString = "";
         hourMinInput first = new hourMinInput();
         Scanner scanIn = new Scanner(System.in);
        boolean hourMin = true;  //true = hours
        String startTime = scanIn.next();
        for (int i = 0; i < startTime.length(); i++){
            if (Character.isDigit(startTime.charAt(i))){
                if (hourMin){
                    hourString += startTime.charAt(i);
                }
                else{
                    minString += startTime.charAt(i);
                }
            }
            else if (startTime.charAt(i) == ':'){
                //System.out.print("COLONS");
                hourMin = false;
            }
            else {
                System.out.print("Unrecognized character, silly.");

                return first;
            }

        }
        first.hour = Integer.parseInt(hourString);
        first.min = Integer.parseInt(minString);
        first.success = true;
        System.out.print (first.hour + ":" + first.min);
        return first;
    }

    public static void main(String[] args) {


       //CONSTANTS:
       final int MIN_IN_HOUR = 60;
       final int HOURS_IN_DAY = 24; //for use with 24-hour clock
       final int HOURS_IN_HALF_DAY = 12; //for use with 12-hour clock
       //
       String startHour = "";
       String startMin = "";
       String elapsedHour;
       String elapsedMin;
       int startHourInt;    //starting hour
       int startMinInt;     //starting min
       int elapsedHourInt;   //elapsed hours
       int elapsedMinInt;      //elapsed min
       int endHour;
       int endMin;
       String ampm; //specifies am/pm in final output

      
       System.out.print("Enter starting time: ");
       /*//scan.useDelimiter(":");*/
       hourMinInput start = getTimeUser();
       if (start.success)
       {
           System.out.println("Success!");
       }


       //Before function below
       /*Scanner scanIn = new Scanner(System.in);
        boolean hourMin = true;  //true = hours

        String startTime = scanIn.next();
       for (int i = 0; i < startTime.length(); i++){
           if (Character.isDigit(startTime.charAt(i))){
               if (hourMin){
                   startHour += startTime.charAt(i);
               }
               else{
                   startMin += startTime.charAt(i);
               }
           }
           else if (startTime.charAt(i) == ':'){
               //System.out.print("COLONS");
               hourMin = false;
           }
           else {
               System.out.print("Unrecognized character, silly.");
           }

       }
       hourMinInput first = new hourMinInput();
       first.hour = Integer.parseInt(startHour);
       first.min = Integer.parseInt(startMin);
       first.success = true;
       System.out.print (first.hour + ":" + first.min);


       if (startTime.length() == 4){
           startHour = Integer.parseInt(startTime.substring(0,1));
           startMin = Integer.parseInt(startTime.substring(2));
       }
       else {
           startHour = Integer.parseInt(startTime.substring(0,2));
           startMin = Integer.parseInt(startTime.substring(3));
       }

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
       if (elapsedTime.length() == 4){
           elapsedHour = Integer.parseInt(elapsedTime.substring(0,1));
           elapsedMin = Integer.parseInt(elapsedTime.substring(2));
       }
       else{
           elapsedHour = Integer.parseInt(elapsedTime.substring(0,2));
           elapsedMin = Integer.parseInt(elapsedTime.substring(3));
       }

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

       DecimalFormat formatter = new DecimalFormat("00");
       String endHourFormatted = formatter.format(endHour);
       String endMinFormatted = formatter.format(endMin);
       //String.format("%02d", endMin);

       System.out.print("(24hr) The time is now " + endHourFormatted + endMinFormatted + ".\n");

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



       System.out.print("(12hr) The time is now " + endHour + ":" + endMinFormatted + " " + ampm + ".\n");
    */
   }
}


