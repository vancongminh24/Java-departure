import java.util.Scanner; 
public class ComputeAreaCircumference {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int inputOption;
    do {
      System.out.println("Compute area and circumference:");
      System.out.println("1.  Square");
      System.out.println("2.  Rectangle");
      System.out.println("3.  Circle");
      System.out.println("0. Exit/Quit");
      System.out.println("Enter your choice:");
      inputOption = input.nextInt();
      if (inputOption == 1) {
        System.out.println("Enter the lenght of size:");
        int inputSquare = input.nextInt();
        int areaSquare = inputSquare*inputSquare;
        int CircumferenceSquare = inputSquare * 4;
        System.out.println("Area of the Square is " + areaSquare);
        System.out.println("Circumference of the Square is "+ CircumferenceSquare);
        System.out.println("");
      }
      else if (inputOption == 2) {
        System.out.println("Enter the base of the rectangle:");
        int inputRectangleBase = input.nextInt();
        System.out.println("Enter the height of the rectangle:");
        int inputRectangleHeight = input.nextInt();
        int areaInterger = inputRectangleBase * inputRectangleHeight;
        int CircumreferRectangle = 2 * (inputRectangleHeight + inputRectangleBase);
        System.out.println("Area of the rectangle is " + areaInterger);
        System.out.println("Circumference of the rectangle is " + CircumreferRectangle);
        System.out.println("");
      }
      else if (inputOption == 3) {
        System.out.println("Enter the radius of the circle:");
        double inputCircleRadius = input.nextDouble();
        double areaCircle = Math.PI * inputCircleRadius * inputCircleRadius;
        double CircumferenceCircle = Math.PI * 2 * inputCircleRadius;
        System.out.println("Area of the circle is: " + areaCircle);
        System.out.println("Circumference of the circle is: " + CircumferenceCircle);
        System.out.println("");
      }
      else if (inputOption >3) {
       System.out.println("Please typing your choice from 0 to 4");
       System.out.println("");
      }
    } while (inputOption != 0);
    System.out.println("Thank you for using the program.");
  }
}
