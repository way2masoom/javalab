// Define a class named Box
class Box {
    int length; // Instance variable to store the length of the box
    int breadth; // Instance variable to store the breadth of the box
    int height; // Instance variable to store the height of the box

    // Default constructor
    Box(){
        // Initialize length, breadth, and height to 0
        this.length = 0;
        this.breadth = 0;
        this.height = 0;
    }

    // Constructor with one parameter to create a cube
    Box(int dim){
        // Initialize length, breadth, and height to the same value (dim)
        this.length = this.breadth = this.height = dim;
    }

    // Constructor with three parameters to create a box with specific dimensions
    Box(int length, int breadth, int height){
        // Initialize length, breadth, and height to the given values
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Method to calculate the volume of the box
    int volume(){
        // Volume = length * breadth * height
        return this.length * this.breadth * this.height;
    }
}
