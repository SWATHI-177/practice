/**import java.util.Scanner;
import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in); // Create a Scanner object

        // Taking a Integer input
        System.out.println("Enter any year: ");
        int Year = scanner.nextInt();
        


    }
    
}
**/
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Year from the user
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Logic to check if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close(); // Close the Scanner
    }
}
