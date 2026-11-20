import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        int[] c = {10, 20, 30, 40, 50, 60};
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum += c[i];               // складываем все числа
        }
        double avg = (double) sum / c.length;   // среднее
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] > avg) count++;   // считаем числа больше среднего
        }
        System.out.print("Array: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
        System.out.println("Average: " + avg);
        System.out.println("Numbers above average: " + count);
    }
}
