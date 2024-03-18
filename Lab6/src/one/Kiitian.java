package one;

public class Kiitian extends Student{
    private final String course;
    Kiitian(int rollNumber, int regNumber, String course){
        super(rollNumber, regNumber);
        this.course = course;
    }
    @java.lang.Override
        public String course() {
           return this.course;
    }
}
