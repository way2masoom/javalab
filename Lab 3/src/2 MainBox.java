// Define a class named MainBox
class MainBox {
    public static void main(String[] args) {
        // Create a Box object with one parameter (creates a cube)
        Box box = new Box(5);

        // Create a Box object with three parameters (creates a box)
        Box box2 = new Box(5, 2, 3);

        // Display the volume of the second box
        System.out.println("Volume of the second box: " + box2.volume());
    }
}