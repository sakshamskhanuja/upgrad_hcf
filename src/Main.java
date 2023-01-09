import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the input.
        Scanner scanner = new Scanner(System.in);

        // Scans the entered numbers.
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Stores the smallest of a and b.
        int small = (a < b) ? a : b;

        // Stores the hcf of a and b.
        int hcf = 1;

        for (int i = 1; i <= small; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        System.out.println(hcf);
    }
}