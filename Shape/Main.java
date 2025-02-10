// Main.java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dim_one, dim_two;
        
        System.out.println("Enter the dimensions of the rectangle:");
        dim_one = sc.nextDouble();
        dim_two = sc.nextDouble();
        Rectangle rect = new Rectangle(dim_one, dim_two);
        System.out.println("Area of the rectangle: " + rect.area());
        System.out.println("Perimeter of the rectangle: " + rect.perimeter());
        sc.close();
    }
}