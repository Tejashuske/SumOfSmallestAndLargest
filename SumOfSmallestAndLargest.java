import java.util.Scanner;

public class SumOfSmallestAndLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting three numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Finding the smallest and largest numbers
        int smallest = Math.min(Math.min(num1, num2), num3);
        int largest = Math.max(Math.max(num1, num2), num3);

        // Calculating the sum of smallest and largest
        int sum = smallest + largest;

        // Displaying the result
        System.out.println("The sum of the smallest (" + smallest + ") and largest (" + largest + ") numbers is: " + sum);
	System.out.println("Scanner closed");
        scanner.close();
    }
}

