package three;

public class Main {
    public static void main(String[] args) {
        Substaff staff = new Substaff(25000);
        System.out.println("Basic Salary : " + staff.basic);
        System.out.println("Earning : " + staff.earning());
        System.out.println("Deduction : " + staff.deduction());
        System.out.println("Bonus : " + staff.bonus());
    }
}
