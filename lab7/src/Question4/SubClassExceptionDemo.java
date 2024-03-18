package Question4;

public class SubClassExceptionDemo {
    public static void main(String[] args) {

        int[] arr = new int[5];
        try{
            System.out.println(arr[2]);
            System.out.println(2/0);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("caught Exception");
            System.out.println(e.getMessage());
        }
    }
}
