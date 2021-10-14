import java.util.Scanner;

public class Zadanie2_2 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = sc.nextInt();
        m(x);
    }
    public static void m(int x) {
        if ( x!=1 ) {
            m(x/2);
        }
        System.out.print(x%2);
    }
}
