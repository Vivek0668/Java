public class Box {
    int length ;
    int height;
    int width;

    Box() {
        this.height = -1;
        this.width = -1;
        this.length = -1;

    }
    Box (int length, int height, int width) {
        this.height = height;
        this.width = width;
        this.length = length;

    }
    Box(int side ) {
        this.height = side;
        this.width =side ;
        this.length = side;

    }
    Box(Box other) {
        this.length = other.length;
        this.height = other.height;
        this.width = other.width;

    }

}
