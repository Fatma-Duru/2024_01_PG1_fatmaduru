package chapter02;
import java.util.Scanner;
public class GMTTimeCalculator {
    public static void main(String[] args) {

        //2. Bölüm 8.Soru
        // Soru Çözüm Kodundan Yardım Aldın!!!

        long toplamMilisaniye = System.currentTimeMillis();
        long toplamSaniye = toplamMilisaniye / 1000;

        long suankiSaat, suankiDakika, suankiSaniye;
        long toplamDakika = toplamSaniye / 60;
        long toplamSaat = toplamDakika / 60;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("GMT'ye göre zaman dilimi ofsetini girin: ");
            int ofset = input.nextInt();

            suankiSaat = (toplamSaat + ofset) % 24;
            suankiDakika = toplamDakika % 60;
            suankiSaniye = toplamSaniye % 60;
        }

        System.out.println("Anlık zaman: " + suankiSaat + ":" + suankiDakika + ":" + suankiSaniye + " GMT");


    }}
