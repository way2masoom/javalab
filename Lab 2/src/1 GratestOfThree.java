import java.util.Scanner;

//17. Create a program that determines the greatest of the three numbers.
class GreatestOfThree {
    public static void main(String[] args) {
        System.out.println("Finding Greatest among 3 Numbers");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the first number :");
        int num1= input.nextInt();

        System.out.print("Enter the first number :");
        int num2= input.nextInt();

        System.out.print("Enter the first number :");
        int num3= input.nextInt();

//        Checking which one is greatest among the THREE number
        if(num1>num2 && num1>num3){
            System.out.println("Number 1 is Greater that is "+num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.println("Number 2 is Grater that is "+num2);
        }
        else {
            System.out.println("Number 3 is Grater that is "+num3);
        }
    }
}

