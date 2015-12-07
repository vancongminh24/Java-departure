/** LeapYear.java by F. M. Carrano
Test whether a given year is a leap year.
A year is a leap year if it is
a) Divisible by 4 but not divisible by 100, or
b) Divisible by 400.
Input: The 4-digit year
Output: The year and a message about whether it is a leap year.
*/
import java.util.Scanner;
public class LeapYear {
  public static void main (String [] args) {
    Scanner keyboard = new Scanner (System.in);
    System.out.println ("This program tests whether a given " +
                        "year is a leap year.");
    System.out.print ("Type the year: ");
    int year = keyboard.nextInt ();
    if (((year%4 == 0) && (year%100 != 0)) || (year%400 == 0))
      System.out.println (year + " is a leap year.");
    else
      System.out.println (year + " is not a leap year.");
  } // end main
} // end LeapYear