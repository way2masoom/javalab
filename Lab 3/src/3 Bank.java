// Define a class named Bank
class Bank {
    public static void main(String[] args) {
        // Create an instance of SavingAccount for account 1
        SavingAccount acc1 = new SavingAccount("Md Alam", 897324381,23400);
        System.out.println("Interest : " + acc1.getInterest(2));

        // Create an instance of SavingAccount for account 2
        SavingAccount acc2 = new SavingAccount("Rohit", 67667557, 55670);
        System.out.println("Interest : " + acc2.getInterest(1));
    }
}