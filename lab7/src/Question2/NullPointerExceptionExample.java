package Question2;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String name = null;

        try{
            int nameLength = name.length();
        }catch (NullPointerException e){
            System.out.println("Name variable is null. Cannot access the length");
            System.out.println(e.getMessage());
        }
        System.out.println("hii");
    }
}
