import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Shape[] shapes = new Shape[3];

        System.out.print("Sisi Square : ");
        double side = input.nextDouble();

        input.nextLine();
        System.out.print("Warna Square : ");
        String warnaSquare = input.nextLine();

        shapes[0] = new Square(side, warnaSquare);

        System.out.print("Radius Circle : ");
        double radius = input.nextDouble();

        input.nextLine();
        System.out.print("Warna Circle : ");
        String warnaCircle = input.nextLine();

        shapes[1] = new Circle(radius, warnaCircle);

        System.out.print("Radius Cylinder : ");
        double radiusCylinder = input.nextDouble();

        System.out.print("Tinggi Cylinder : ");
        double tinggi = input.nextDouble();

        input.nextLine();
        System.out.print("Warna Cylinder : ");
        String warnaCylinder = input.nextLine();

        shapes[2] = new Cylinder(
            tinggi,
            radiusCylinder,
            warnaCylinder
        );

        System.out.println("\n=== HASIL ===");

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].printInfo();
        }

        input.close();
    }
}