import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of Rectangle: ");
        double length = Double.parseDouble(sc.nextLine());

        System.out.println("Enter breadth of Rectangle: ");
        double breadth = Double.parseDouble(sc.nextLine());



        Shape rect = new Rectangle(length, breadth);
        System.out.println("\nArea of the rectangle: " + rect.area());
        System.out.println("Perimeter of the rectangle: " + rect.perimeter());


        // Circle
        double radius = Double.parseDouble(sc.nextLine());
        Shape circle = new Circle(radius);
        System.out.println("\nEnter radius of Circle: ");
        
        System.out.println("\nArea of the circle: " + circle.area());
        System.out.println("Perimeter of the circle: " + circle.perimeter());

        // Pyramid
        System.out.println("\nEnter side of Pyramid: ");
        double side = Double.parseDouble(sc.nextLine());

        
        System.out.println("\nEnter height of Pyramid: ");
        double height = Double.parseDouble(sc.nextLine());
        Shape pyramid = new Pyramid(side, height);
        



        sc.close();
    }
}