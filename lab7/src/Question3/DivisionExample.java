package Question3;

import java.util.Scanner;

public class DivisionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int a = sc.nextInt();
        System.out.print("Enter second Number : ");
        int b = sc.nextInt();

        
        try {
            int c = a / b;
            System.out.println("Divide ans : " + a / b);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by Zero");
        }finally {
            System.out.println();
        }
    }
}
