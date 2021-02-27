import java.util.Scanner;

public class Main {
  public static void main(String[] args) 
  {
    System.out.println("Good new years eve everyone, welcome to the annual countdown!");

    Scanner scan = new Scanner(System.in);// inputing scanner system.

    System.out.println("The clock is going to strike 12 in a couple seconds here, is everyone excited for the new year, this next year is going to be the year...");
    int year = scan.next();
      System.out.println("I'm your host Brad peterson bringing you the countdown to" + year);
      System.out.println("Get excited for the new year in 11...");
      newYearsTimer(10);
  }

  public static void newYearsTimer(int timerValue)
  {
    if (timerValue == 1)
      {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
      }
    else{
      System.out.println(timerValue);
      timerValue--;
      newYearsTimer(timerValue);
        }
    }
  }
