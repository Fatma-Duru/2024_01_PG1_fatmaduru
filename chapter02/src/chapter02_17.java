import java.util.Scanner;
public class chapter02_17 {
    public static void main(String[] args) {
        //2.Bölüm 17. Soru
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dış sıcaklığı (-58 ºF ile 41ºF arasında) giriniz: ");
        double disSicaklik = scanner.nextDouble();

        System.out.print("Rüzgar hızını (2 mil/saat ve üzeri) giriniz: ");
        double ruzgarHizi = scanner.nextDouble();
        double ruzgarSisesiSicakligi = 35.74 + 0.6215 * disSicaklik - 35.75 * Math.pow(ruzgarHizi, 0.16) + 0.4275 * disSicaklik * Math.pow(ruzgarHizi, 0.16);
        System.out.print("Hissedilen sicaklik: "+ruzgarSisesiSicakligi);
    }
    }
