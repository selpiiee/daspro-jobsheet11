public class Cube21 {
    public static int calculateArea(int side) {
        return 6 * side * side;
    }

    public static int calculateVolume(int side) {
        return side * side * side;
    }

    public static void main(String[] args) {
        int side = 5;
        System.out.println("Area = " + calculateArea(side));
        System.out.println("Volume = " + calculateVolume(side));
    }
}