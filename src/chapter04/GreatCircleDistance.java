package chapter04;
import java.util.Scanner;
public class GreatCircleDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        final double DUNYA_YARICAPI = 6371.01; // kilometre cinsinden

        System.out.print("Nokta 1'in enlem ve boylamını (derece cinsinden) girin: ");
        double x1 = Math.toRadians(scanner.nextDouble());
        double y1 = Math.toRadians(scanner.nextDouble());

        System.out.print("Nokta 2'nin enlem ve boylamını (derece cinsinden) girin: ");
        double x2 = Math.toRadians(scanner.nextDouble());
        double y2 = Math.toRadians(scanner.nextDouble());

        // En iyi çember mesafesini hesapla
        double mesafe = DUNYA_YARICAPI * Math.acos(Math.sin(x1) * Math.sin(x2)
                + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        // Sonucu ekrana yazdır
        System.out.println("İki nokta arasındaki mesafe " + mesafe + " km'dir.");

        scanner.close();
    }
}
