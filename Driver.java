import java.util.Scanner;

public class Driver {

   Scanner s;
   Driver () {
      s = new Scanner(System.in);
   }
   public void input() {

      String option;
      boolean exit = false;


      System.out.println("Please enter the name of the txt file containing the player data: ");
      String fileName = s.nextLine();
      Roster r = new Roster(fileName);

      while (!exit) {
         System.out.println("Please enter an option (o for a list of options): ");
         option = s.nextLine();
         if (option.equals("o")) {
            System.out.println("Options: ");
            System.out.println("1. Sort by goals");
            System.out.println("2. Sort by total points");
            System.out.println("3. Quit");
         } else if (option.equals("1")) {
            r.sortGoals();
            r.display();
         } else if (option.equals("2")) {
            r.sortPoints();
            r.display();
         } else if (option.equals("3")) {
            exit = true;
            System.out.println("Thank you for using this program.");
         } else {
            System.out.println("Please enter a valid option.");
         }
      }
   }

   public static void main(String args[]) {
      Driver d = new Driver();
      d.input();
   }
}