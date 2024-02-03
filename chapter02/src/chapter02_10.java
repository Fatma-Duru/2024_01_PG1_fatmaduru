import java.util.Scanner;
public class chapter02_10 {
    public  static void main(String[] args){
        // 2. Bölüm 10. Soru
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen su miktarını giriniz (kilogram):  ");
        double suMiktari = scanner.nextDouble();

        System.out.println("Lütfen ilk sicaklik değerini giriniz  :  ");
        double ilkSicaklik = scanner.nextDouble();

        System.out.println("Lütfen son sicaklik değerini giriniz  :  ");
        double sonSicaklik = scanner.nextDouble();

        scanner.close();

        double gerekliEnerji= suMiktari*(sonSicaklik-ilkSicaklik)*4184;
        System.out.println("Gerekli Enerji "+ gerekliEnerji);


    }
}
