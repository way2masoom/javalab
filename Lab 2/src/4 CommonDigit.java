import java.util.Scanner;

// Write a program in Java to find the common digits of two user-entered numbers.
class CommonDigit {
    public static void main(String[] args) {
        // Displaying a welcome message
        System.out.println("Finding Common Digits");

        // Creating a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter the numbers
        System.out.print("Enter First number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second number: ");
        int num2 = sc.nextInt();

        // Checking and printing common digits
        while (num1 != 0) {
            // Extracting the last digit of num1
            int digitA = num1 % 10;
            int temp = num2;

            // Checking each digit of num2 against digitA
            while (temp != 0) {
                // Extracting the last digit of temp
                int digitB = temp % 10;

                // If the digits are equal, printing the common digit
                if (digitA == digitB) {
                    System.out.println("Common Digit: " + digitA);
                }

                // Removing the last digit from temp
                temp = temp / 10;
            }

            // Removing the last digit from num1
            num1 = num1 / 10;
        }

        // Closing the Scanner to release resources
        sc.close();
    }
}
