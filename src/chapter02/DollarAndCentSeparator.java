package chapter02;
import java.util.Scanner;
public class DollarAndCentSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 2.Bölüm 22. Soru
        System.out.print("Miktarı girin (örneğin 1156, 11 dolar ve 56 sent): ");
        int miktar = scanner.nextInt();

        // Dolar ve sentleri hesapla
        int dolar = miktar / 100; // Tam kısmı dolar olarak al
        int sent = miktar % 100; // Son iki basamak sentleri temsil eder

        System.out.println("Miktar: $" + dolar + "." + (sent < 10 ? "0" + sent : sent));

        scanner.close();
    }
}
