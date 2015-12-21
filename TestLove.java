import java.util.Scanner;

class TestLove {
  public static void main(String [] args) {
   Scanner input = new Scanner(System.in);
   Boolean love = true;
   String answer;
   
   while (love) {
     System.out.println("3rd Party?");
     answer = input.nextLine();
     if (answer.equalsIgnoreCase("Y"))
           break;
     System.out.print("Lost Faith?");
     if (answer.equalsIgnoreCase("Y"))
           break;
     system.out.println("Bye~ True Love");
         
   }
  }