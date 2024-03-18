import java.util.Scanner;

//3. Write a program in Java to print the result of
// AND ,OR & XOR operation on two user entered integers.
 class LogicalOperators {
    public static void main(String[] args) {
     System.out.println("Logical Operators AND(&&), OR(||) and NOT(!)");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a first Number:");
        int num1=input.nextInt();
        System.out.print("Enter a Second Number:");
        int num2=input.nextInt();

//      // Performing AND, OR, and XOR operations
        int andResult = num1 & num2;
        int orResult = num1 | num2;
        int xorResult = num1 ^ num2;

       // Displaying the results
        System.out.println("Result of AND operation: " + andResult);
        System.out.println("Result of OR operation: " + orResult);
        System.out.println("Result of XOR operation: " + xorResult);



    }




}
