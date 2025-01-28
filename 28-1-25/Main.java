import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter PRN: ");
        int prn = sc.nextInt();
        
        StudentOperations operations = new StudentOperations();
        Student student = new Student(name, prn);
        operations.addStudents(student);
        operations.displayStudents();

        sc.close();
    }
}