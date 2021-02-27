import java.util.Scanner;

public class Main {
  public static void main(String[] args) 
  {
    System.out.println("Good new years eve everyone, are you excited for the new year?");
    Scanner scan = new Scanner(System.in);
    System.out.println("");
    String year = scan.next();
      System.out.println("");
      System.out.println("");
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
      timerValue
      newYearsTimer(timerValue);
        }
    }
  }
}

