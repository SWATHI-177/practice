import java.util.Scanner;
public class ReverseString {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: A string from the user
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Reverse the string
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // Append characters in reverse order
        }

        // Output the reversed string
        System.out.println("Reversed string: " + reversed);

        scanner.close(); // Close the Scanner
    }
}

    
