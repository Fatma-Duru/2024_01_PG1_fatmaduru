package chapter02;
import java.util.Scanner;

public class AverageAccelerationCalculator {
    public static void main(String[] args) {

        // 2. Bölüm 9. Soru

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Başlangıç Hızı Giriniz (metre/saniye): ");
        double v0 = scanner.nextDouble();
        System.out.println("Lütfen Bitiş Hızı Giriniz (metre/saniye): ");
        double v1 = scanner.nextDouble();
        System.out.println("Lütfen Zamanı Giriniz (saniye): ");
        double t = scanner.nextDouble();
        scanner.close();

        // Ortalama ivme formülü düzeltildi
        double ivme = (v1 - v0) / t;
        System.out.println("Ortalama İvme Eşittir " + ivme);
    }
}
