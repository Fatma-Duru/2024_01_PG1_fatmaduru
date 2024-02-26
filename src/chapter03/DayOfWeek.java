package chapter03;
import  java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Bugünün gününü giriniz (Pazar - 0, Pazartesi - 1, ..., Cumartesi - 6): ");
        int bugun = input.nextInt();

        System.out.print("Kaç gün sonra? : ");
        int gunSonrasi = input.nextInt();


        int yeniGun = (bugun + gunSonrasi) % 7;


        String yeniGunAdi = "";
        switch (yeniGun) {
            case 0:
                yeniGunAdi = "Pazar";
                break;
            case 1:
                yeniGunAdi = "Pazartesi";
                break;
            case 2:
                yeniGunAdi = "Salı";
                break;
            case 3:
                yeniGunAdi = "Çarşamba";
                break;
            case 4:
                yeniGunAdi = "Perşembe";
                break;
            case 5:
                yeniGunAdi = "Cuma";
                break;
            case 6:
                yeniGunAdi = "Cumartesi";
                break;
            default:
                yeniGunAdi = "Geçersiz gün";
                break;
        }


        System.out.println("Bugünden " + gunSonrasi + " gün sonrası " + yeniGunAdi + "'dir.");
    }

}
