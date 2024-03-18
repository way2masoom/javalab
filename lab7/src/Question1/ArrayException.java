package Question1;

public class ArrayException {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++){
            arr[i] = i + 1;
        }
        try{
            System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
