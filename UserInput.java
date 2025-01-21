import java.util.Scanner;

class UserInput {
    int[] arrayInput() {
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }
}