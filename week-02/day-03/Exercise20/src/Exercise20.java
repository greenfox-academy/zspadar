import java.util.Scanner;

/**
 * Created by zsuzsanna.padar on 2017. 03. 22..
 */
public class Exercise20 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please give me a number!");
    int userinput1 = scanner.nextInt();

    System.out.println("Please give me another number!");
    int userinput2 = scanner.nextInt();

    if (userinput1 > userinput2 ) {
      System.out.println("The bigger number is: " + userinput1);
    } else if (userinput2 > userinput1) {
      System.out.println("The bigger number is: " + userinput2);
    } else {
      System.out.println("The two numbers are equal!!!");
    }
  }
}

