
import java.util.Scanner;

public class WhatstheArea {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int surfaceArea = 0;
        surfaceArea += triangle();
        surfaceArea += triangle();
        surfaceArea += circle();
        surfaceArea += circle();
        surfaceArea += circle();
        surfaceArea += square();
        surfaceArea -= square();
        surfaceArea += parallelogram();

//TODO: add calls to other methods for each of the shapes needed
        System.out.println("\nThe total area of Michael’s truck is : " + surfaceArea);
    }

    public static int triangle() {
        System.out.println("\nThe area of a triangle is: 1/2 * base * height");
        System.out.print("base > ");
        int base = in.nextInt();
        System.out.print("height > ");
        int height = in.nextInt();
        int area = (int) (0.5 * base * height);
        System.out.println("The area of this shape is: " + area);
        return area;
    }

    public static int circle() {
        System.out.println("\n The area of a circle is pi * radius sqaured");
        System.out.print("area >");
        int radius = in.nextInt();
        int areaC = (int) (Math.pow(radius, 2) * Math.PI);
        System.out.println("The area of the shape is " + areaC);
        return areaC;

    }

    public static int square() {
        System.out.println("The area of a square is the length of a side squared.");
        System.out.print("side length >");
        int sideLength = in.nextInt();
        int areaS = (int) (Math.pow(sideLength, 2));
        System.out.println("The area of the shape is " + areaS);
        return areaS;
    }

    public static int parallelogram() {
        System.out.println("The area of a parallelogram is base times height.");
        System.out.print(" base > ");
        int baseSize = in.nextInt();
        System.out.print("height > ");
        int height = in.nextInt();
        int areaP = (int) baseSize * height;
        System.out.println("The area of the shape is " + areaP);
        return areaP;

    }

}
//TODO: write methods for each of the different sh
