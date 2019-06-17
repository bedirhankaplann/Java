import java.util.Scanner;

public class Test
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius = ");
        double radius = input.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println(circle.toString());
        System.out.println("Radius = " + circle.getRadius());
        System.out.println("Area = " + circle.calcArea() + " br.");

    }
}