import java.util.Scanner;
public class ReverseNum {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: A number from the user
        System.out.print("Enter a number to reverse: ");
       int number = scanner.nextInt();
       
        int reverse = 0;
        int temp = Math.abs(number); // Handle negative numbers
       
        // Reverse the number
        while (temp > 0) {
            int digit = temp % 10;     // Extract the last digit
            reverse = reverse * 10 + digit; // Append it to the reversed number
            temp /= 10;               // Remove the last digit
        }

        // If the original number was negative, make the reversed number negative
        if (number < 0) {
            reverse = -reverse;
        }

        // Output the reversed number
        System.out.println("Reversed number: " + reverse);

        scanner.close(); // Close the Scanner
    }
}


    
