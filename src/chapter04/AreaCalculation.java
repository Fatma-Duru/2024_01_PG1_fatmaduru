package chapter04;
import java.util.Scanner;
public class AreaCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Çokgenin kenar sayısını girin: ");
        int n = scanner.nextInt();

        System.out.print("Çokgenin bir kenar uzunluğunu girin: ");
        double s = scanner.nextDouble();

        double alan = alanHesapla(n, s);
        System.out.println("Çokgenin alanı: " + alan);

        scanner.close();
    }

    public static double alanHesapla(int n, double s) {
        double alan = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
        return alan;
    }
}
