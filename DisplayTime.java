import java.util.Scanner;
public class DisplayTime {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter total number of seconds:");
    int seconds = input.nextInt();
    int hours = seconds / 3600;
    int minutes = (seconds - (hours*3600)) / 60;
    int remainingSeconds = seconds % 60;
    System.out.println("The duration is " + hours + " hours " + minutes + " minutes and "+ remainingSeconds + " seconds");
  }
}