import java.util.Scanner;

public class Zadanie2_3 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Объем массива: ");
        int x = sc.nextInt();
        arr(1, new int[x], 0);
    }
    public static void arr(int i, int[] array, int j) {
        if (i <= array.length) {
            System.out.println("Значение " +i+ " элемента: ");
            Scanner sc = new Scanner(System.in);
            int zn = sc.nextInt();
            array[i-1] = zn;
            arr(i + 1, array, 0);
        }
        else if (j < array.length) {
            System.out.println("[" +array[j]+ "]");
            arr(i, array, j+1);
        }
    }
}
