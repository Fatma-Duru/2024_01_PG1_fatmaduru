package chapter03;
import java.util.Random;

public class RandomMonth {
    public static void main(String[] args) {

        Random random = new Random();


        int rastgeleSayi = random.nextInt(12) + 1;


        String ay;
        switch (rastgeleSayi) {
            case 1:
                ay = "Ocak";
                break;
            case 2:
                ay = "Şubat";
                break;
            case 3:
                ay = "Mart";
                break;
            case 4:
                ay = "Nisan";
                break;
            case 5:
                ay = "Mayıs";
                break;
            case 6:
                ay = "Haziran";
                break;
            case 7:
                ay = "Temmuz";
                break;
            case 8:
                ay = "Ağustos";
                break;
            case 9:
                ay = "Eylül";
                break;
            case 10:
                ay = "Ekim";
                break;
            case 11:
                ay = "Kasım";
                break;
            case 12:
                ay = "Aralık";
                break;
            default:
                ay = "Geçersiz ay"; // Bu durum normalde oluşmamalı
                break;
        }

        System.out.println("Rastgele seçilen ay: " + rastgeleSayi + " - " + ay);
    }
}
