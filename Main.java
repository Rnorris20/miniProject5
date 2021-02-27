import java.util.Scanner;

public class Main {
  public static void main(String[] args) 
  {
    //start of print statement regarding countdown.
    System.out.println("Good new years eve everyone, welcome to the annual countdown!");

    Scanner scan = new Scanner(System.in);// inputing scanner system.

//print statements asking the user for their input
    System.out.println("The clock is going to strike 12 in a couple seconds here, is everyone excited for the new year, what are your resolutions?");

//scan statements for the resolution.
    String resolutions = scan.next();

      System.out.println("I'm glad to see that your resolution is " + resolutions + ", now back to the countdown");
      System.out.println("Get excited for the new year in 11...");
      newYearsTimer(10);
  }
//start of recursion statement stating the countdown and future resolutions.
  public static void newYearsTimer(int timerValue)
  {
    // base statement to stop the cycle.
    if (timerValue == 0)
      {
        System.out.println("Happy new year everyone");
        System.out.println("Lets wish for our resolutions to become true and make this year better than the last");
      }
      //recursion statements to click down from 10-1
    else{
      System.out.println(timerValue);
      timerValue--;
      newYearsTimer(timerValue);
        }
    }
  }
