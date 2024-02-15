package chapter03;
import java.util.Scanner;

public class ThreeNumberAdditionGame {
    public static void main(String[] args) {
        //3. Bölüm  2. Soru
        int sayi1 = (int)(Math.random() * 100);
        int sayi2 = (int)(Math.random() * 100);
        int sayi3 = (int)(Math.random() * 100);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen " + sayi1 + ", " + sayi2 + ", " + sayi3 + " sayılarının toplamını giriniz: ");
        int toplam = sayi1 + sayi2 + sayi3;
        int klavyeToplam = scanner.nextInt();
        if (toplam == klavyeToplam)
            System.out.println("İşlem doğru");
        else
            System.out.println("İşlem hatalı! İşlemin doğru sonucu: " + toplam);
    }
}
