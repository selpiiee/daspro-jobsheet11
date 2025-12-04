
import java.util.Scanner;

public class Experiment6_21 {

    static int calculateArea(int l, int p) {
        int area = p * l;
        return area;
    }

    static int calculateVolume(int l, int p, int t) {
        int vol = calculateArea(l, p) * t;
        return vol;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;
        System.out.print("Input length = ");
        p = input.nextInt();
        System.out.print("Input width = ");
        l = input.nextInt();
        System.out.print("Input height = ");
        t = input.nextInt();

        L = calculateArea(p, l);
        System.out.println("Area of the rectangle = " + L);
        vol = calculateVolume(t, p, l);
        System.out.println("Volume of the rectangle = " + vol);
    }

}
