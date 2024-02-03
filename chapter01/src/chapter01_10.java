import java.util.Scanner;

public class chapter01_10 {

    public static void main(String[] args) {

        //1.10
        // Koşulan mesafe ve süre
        double mesafeKm = 14.0;
        // 45 dakika 30 saniye
        double sureDakika = 45.0 + 30.0 / 60.0;
        double birMilKm = 1.6;
        // Hızı hesapla: hız = mesafe / süre
        double hizKmSaat = mesafeKm / sureDakika * 60;

        // Hızı mil/saat cinsine çevir: 1 mil = 1.6 km
        double hizMilSaat = hizKmSaat / birMilKm;
        // Sonucu ekrana yazdır
        System.out.println("Ortalama Hız: " + hizMilSaat + " mil/saat");

        }
}