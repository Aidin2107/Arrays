import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        int[] d = {3, 8, 12, 5, 9, 2, 7};
        System.out.print("Original: ");
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();
        System.out.print("Reversed: ");
        for (int i = d.length - 1; i >= 0; i--) {   // идём с конца к началу
            System.out.print(d[i] + " ");
        }
        System.out.println();}
}
