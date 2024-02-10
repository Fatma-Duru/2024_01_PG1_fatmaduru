import java.util.Scanner;
public class chapter02_12 {
    public static void main(String[] args) {

        // 2.Bölüm 12. Soru
        Scanner input = new Scanner(System.in);
        System.out.print("Hızı (metre/saniye) giriniz: ");
        double hiz = input.nextDouble();

        System.out.print("Ivmeyi (metre/saniye kare) giriniz: ");
        double ivme = input.nextDouble();

        double pistMesafesi = Math.pow(hiz, 2) / (2 * ivme);

        System.out.println("Gerekli en az pist mesafesi: " + pistMesafesi + " metre");
    }
}
