import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int[] s = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter score (0-100): ");
            s[i] = Scan.nextInt();
            while (s[i] < 0 || s[i] > 100) {
                System.out.print("Wrong! Enter score (0-100): ");
                s[i] = Scan.nextInt();
            }
        }

        int passed = 0, failed = 0, total = 0;
        for (int i = 0; i < 5; i++) {
            total += s[i];
            if (s[i] >= 60) passed++;
            else failed++;
        }

        System.out.print("Scores: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Average: " + (double) total / 5);
    }
}
