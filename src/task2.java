import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
    int[] b = {12, 5, 28, 3, 19, 7, 15, 9};
        int maxI = 0, minI = 0;
        for (int i = 0; i < b.length; i++) {
        if (b[i] > b[maxI]) maxI = i;
        if (b[i] < b[minI]) minI = i;
        }
                System.out.print("Array: ");
        for (int i = 0; i < b.length; i++) {
        System.out.print(b[i] + " ");
        }
                System.out.println();
        System.out.println("Largest: " + b[maxI] + " at index " + maxI);
        System.out.println("Smallest: " + b[minI] + " at index " + minI);}
    }
