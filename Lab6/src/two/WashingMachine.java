package two;

public class WashingMachine implements Motor{

    @Override
    public void run() {
        System.out.println("Washing machine is running");
    }

    @Override
    public void consume() {
        System.out.println("Washing machine is consuming");
    }

}
