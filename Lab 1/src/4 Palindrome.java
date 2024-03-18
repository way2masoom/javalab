//4. Write a program in Java to check a number is palindrome or not.

class Palindrome {
    public static void main(String[] args) {
        int num = 21;

        int temp = num;
        int rev = 0; // revourse

        while (temp > 0) {
            int rem = temp % 10; // to get  Last digit
            rev = rev * 10 + rem; // aadd rev + last digit
            temp = temp / 10; // to remove the last Digit
        }

        if (num == rev) {
            System.out.println("Number is Palindrome.");
        } else {
            System.out.println("Number is not palindrome.");
        }
    }
}