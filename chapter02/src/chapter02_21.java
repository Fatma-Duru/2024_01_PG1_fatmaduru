import java.util.Scanner;

public class chapter02_21 {
    public static void main(String[] args){
        //2. Bölüm 21. Soru
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yatırım Miktarını Giriniz: ");
        double yatirimMiktari = scanner.nextDouble();

        System.out.print("Yıllık Faiz Oranını Yüzde Olarak Giriniz: ");
        double faizOraniYuzde = scanner.nextDouble();

        double faizOrani = faizOraniYuzde / 100;

        System.out.print("Yıl Sayısını Giriniz:  ");
        double yil = scanner.nextDouble();

        double gelecektekiDeger = yatirimMiktari * Math.pow((1 + faizOrani), yil);

        System.out.printf("Gelecekteki Yatırım Değeri: %.2f", gelecektekiDeger);
        scanner.close();
    }
}
