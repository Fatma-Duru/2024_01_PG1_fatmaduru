package chapter02;
import java.util.Scanner;
public class chapter02_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan üç noktanın koordinatlarını al
        System.out.println("1. noktanın x ve y koordinatlarını giriniz:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("2. noktanın x ve y koordinatlarını giriniz:");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println("3. noktanın x ve y koordinatlarını giriniz:");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        // Her bir kenarın uzunluğunu hesapla
        double kenar1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));//Öklid uzaklığı
        double kenar2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double kenar3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        // Üçgenin yarı çevresini hesapla
        double yariCevre = (kenar1 + kenar2 + kenar3) / 2;

        // Üçgenin alanını hesapla (Heron formülü)
        double alan = Math.sqrt(yariCevre * (yariCevre - kenar1) * (yariCevre - kenar2) * (yariCevre - kenar3));

        System.out.println("Üçgenin alanı: " + alan);
        scanner.close();

}}
