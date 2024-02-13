package chapter01;

public class PopulationProjection {
    public static void main(String[] args) {

        //Soru 1.11
        int baslangicNufusu = 0;
        int saniyedeDogum = 7;
        int saniyedeOlum = 13;
        int saniyedeGocmen = 45;

        // Bir yılın saniye sayısı
        int saniyeSayisiYilda = 365 * 24 * 60 * 60;

        // Yılda gerçekleşen doğum, ölüm ve göçmen sayıları
        int yildaDogum = saniyeSayisiYilda / saniyedeDogum;
        int yildaOlum = saniyeSayisiYilda / saniyedeOlum;
        int yildaGocmen = saniyeSayisiYilda / saniyedeGocmen;

        int yildaNufusArtisi = yildaDogum - yildaOlum + yildaGocmen;

        // Beş yıl boyunca nüfus tahminlerini göster
        for (int i = 1; i <= 5; i++) {
            baslangicNufusu += yildaNufusArtisi;
            System.out.println(i + ". yılın tahmini nüfusu artışı : " + baslangicNufusu);

        }}
}