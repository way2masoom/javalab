//Write a program in java to take first name and lst name from user
// and print both in one line as last name followed by first name

import java.util.Scanner;

class FirstnameLastName {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the your First Name: ");
        String Fname=input.nextLine();
        System.out.print("Enter the your First Name: ");
        String Lname=input.nextLine();
        System.out.println(Fname+""+Lname);


    }
}
//3. Write a program in Java to print the result of
// AND ,OR & XOR operation on two user entered integers.