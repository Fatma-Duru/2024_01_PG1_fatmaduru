import java.util.Scanner;
public class chapter02_11 {
    public static void main(String[] args) {

       // 2. Bölüm 11. Soru
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç yıl sonra nüfusu görmek istiyorsunuz: ");
        int yilSayisi = input.nextInt();


        final int mevcutNufus = 312032486;

        // Belirtilen yıl sayısından sonra nüfus projeksiyonunu hesapla
        final int yildaSaniye = 365 * 24 * 60 * 60;
        final int yildaDogum = yildaSaniye / 7;
        final int yildaOlum = yildaSaniye / 13;
        final int yildaGocmen = yildaSaniye / 45;

        final int nufusProjeksiyonu = mevcutNufus + (yilSayisi * (yildaDogum - yildaOlum + yildaGocmen));


        System.out.println(yilSayisi + " yıl sonra nüfus: " + nufusProjeksiyonu);

    }
}
