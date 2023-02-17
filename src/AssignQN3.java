import java.util.Scanner;
public class CylinderCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();

        System.out.print("Enter the length of the cylinder: ");
        double length = input.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;
        double circumference = 2 * radius * Math.PI;

        System.out.println("The area of the cylinder is " + area);
        System.out.println("The volume of the cylinder is " + volume);
        System.out.println("The circumference of the cylinder is " + circumference);
    }
}
