// 2. Write a program to print the corresponding grade for the given mark using if..else statement in Java.


 class GradeMarks {
    public static void main(String[] args) {
        int marks=80;
        System.out.println("Grade : ");

        if(marks >= 90 && marks<=100){
            System.out.println("O");
        }
        else if(marks>=80 && marks<=89){
            System.out.println("E");
        }
        else if(marks >=70 && marks<=79){
            System.out.println("A");
        }
        else if(marks >=60 && marks<=69){
            System.out.println("B");
        }
        else if(marks>=50 && marks<=59){
            System.out.println("C");
        }
        else if(marks >=40 && marks<=49){
            System.out.println("D");
        }
        else{
            System.out.println("Fail");
        }
    }
}