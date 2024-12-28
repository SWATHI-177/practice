import java.util.Scanner;

public class MultNum {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number :");
        int  n=scanner.nextInt();
        System.out.println("\nMultiplication Table for " + n + ":");
      /**   for(int i=1;i<=10;i++)
        {
            System.out.println(n + "x" + i + "=" + (n*i));
        }*/
        int  i=scanner.nextInt();
        while (i<=10) {

            System.out.println(n + "x" + i + "=" + (n*i));
            i++;
        }
        scanner.close();

    }
    
}
