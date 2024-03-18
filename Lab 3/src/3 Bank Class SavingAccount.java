// Define a class named SavingAccount
class SavingAccount {
    // Declare a static variable to store the interest rate
    static float interestRate = 8.0f;

    // Declare instance variables to store account details
    long accountNo; // Account number
    String name; // Name of the account holder
    double balance; // Current balance in the account

    // Constructor to initialize account details
    SavingAccount(String name, long accountNo, double balance){
        this.name = name;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    // Method to modify the interest rate
    static void modifyInterest(float interest){
        interestRate = interest;
    }

    // Method to calculate interest based on time
    double getInterest (int time){
        // Calculate interest using the formula: (balance * time * interestRate) / 100
        return (this.balance * (float)time * interestRate) / 100;
    }
}
