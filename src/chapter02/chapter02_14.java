package chapter02;
import java.util.Scanner;

public class chapter02_14 {
    public static void main(String[] args){
        //2.Bölüm 14.Soru
        Scanner scanner = new Scanner(System.in);
        System.out.print("Agirligi pound cinsinden giriniz: ");
        double agirlikPound = scanner.nextDouble();
        System.out.print("Uzunlugu inch cinsinden giriniz: ");
        double boyInch = scanner.nextDouble();

        // Ağırlığı kilograma çevir
        double agirlikKg = agirlikPound * 0.45359237;

        // Boyu metreye çevir
        double boyMetre = boyInch * 0.0254;

        double vki = agirlikKg / (boyMetre * boyMetre);
        System.out.println("BMI " + vki + "'tur.");

    }
}
