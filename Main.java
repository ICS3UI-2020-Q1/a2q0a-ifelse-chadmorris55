import java.util.Scanner;

/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //license age
    final int LICENSE_AGE = 16;
    final int VOTING_AGE = 18;
    // create Scanner for user input
    Scanner input = new Scanner(System.in);

    //asks user for age
    System.out.println("Please enter your age:");
    int age = input.nextInt();
    
    //checks if user and drive, vote, or both
    if (age>= VOTING_AGE){
      System.out.println("You are old enough to drive and vote!");
    } else if (age >= LICENSE_AGE){
      System.out.println("You can get your driver's license!");
      } else {
        System.out.println("Sorry, you are not old enough to drive or vote.");
}
  }
}
