package one;
public abstract class  Student {
    int rollNumber;
    int regNumber;
    Student(int rollNumber, int regNumber){
        this.rollNumber = rollNumber;
        this.regNumber = regNumber;
    }

    public abstract String course();
}
