public class Box {
    int length;
    int breadth;
    int height;

    Box(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    int volume(){

        return this.length * this.breadth * this.height;
}
}