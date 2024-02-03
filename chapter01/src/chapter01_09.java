import java.util.Scanner;

public class chapter01_09 {
    public static void main(String[] args) {
        //Soru 1.9
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dikdörtgenin Genişliğini Girin: ");
        double genislik = scanner.nextDouble();

        System.out.print("Dikdörtgenin Yüksekliğini Girin: ");
        double yukseklik = scanner.nextDouble();
        scanner.close();

        // Alanı hesapla
        double alan = genislik * yukseklik;

        // Çevreyi hesapla
        double cevre = 2 * (genislik + yukseklik);

        System.out.println("Dikdörtgenin Alanı: " + alan);
        System.out.println("Dikdörtgenin Çevresi: " + cevre);
        }
}