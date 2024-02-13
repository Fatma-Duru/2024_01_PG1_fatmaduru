package chapter01;
import java.util.Scanner;

public class CircleProperties {
    public static void main(String[] args) {
        // Soru 1.8
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dairenin Yarı Çapını Girin: ");
        double yariCap = scanner.nextDouble();
        scanner.close();

        double cevre = 2 * yariCap * Math.PI;
        double alan = yariCap * yariCap * Math.PI;

        System.out.println("Dairenin Çevresi: " + cevre);
        System.out.println("Dairenin Alanı: " + alan);
    }
}