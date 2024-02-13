package chapter01;
import java.util.Scanner;

public class TablePrinter {
    public static void main(String[] args) {
        /*
        System.out.println("a      a^2    a^3");
        System.out.println("1      1      1");
        System.out.println("2      4      8");
        System.out.println("3      9      27");
        System.out.println("4      16     64");
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Tablo için bir sınır değeri giriniz: ");
        int sinir = scanner.nextInt();

        System.out.println("a      a^2    a^3");
        for (int a = 1; a <= sinir; a++) {
            int kare = a * a;
            int kup = a * a * a;
            System.out.printf("%-6d %-6d %-6d\n", a, kare, kup);
        }

        scanner.close();
    }
}
