/** SquareOfStars.java by F. M. Carrano
Displays a square pattern of asterisks (stars).
Input: the number of stars per row.
*/
import java.util.Scanner;
public class SquareOfStars {
  public static void main (String [] args) {
    Scanner keyboard = new Scanner (System.in);
    System.out.print ("What is the length of the square's side? ");
    int sideLength = keyboard.nextInt ();
    int rowCounter = 1;
    while (rowCounter <= sideLength) {
      int starCounter = 1;
      while (starCounter <= sideLength) {
        System.out.print ("* ");
        starCounter++;
      } // end while
      System.out.println ();
      rowCounter++;
    } // end while
  } // end main
} // end SquareOfStars