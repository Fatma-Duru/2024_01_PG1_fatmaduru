package chapter02;
import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {

        // 2.Bölüm 7.Soru
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dakika olarak bir süre giriniz: ");
        long toplamDakika = scanner.nextLong();
        scanner.close();

        long yil = toplamDakika / (365 * 24 * 60);
        long kalanGun = toplamDakika % (365 * 24 * 60) / (24 * 60);


        System.out.println(toplamDakika + " dakika, " + yil + " yıl, " + kalanGun + " gün ve " + (toplamDakika % (24 * 60)) + " dakikadır.");

    }
}
