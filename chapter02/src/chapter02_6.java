import java.util.Scanner;

public class chapter02_6 {
    public static void main(String[] args){

        // 2. Bölüm 6. Soru

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 0 ile 1000 Arasında bir tam sayı giriniz: ");
        int tamSayi = scanner.nextInt();
        scanner.close();

        int toplam=0;
        int i;
        for(i=tamSayi; i!=0; i/=10){
            int basamak = i%10;

            toplam += basamak;
        }

        System.out.println("Girilen tam sayının basamak değerlerinin toplamı: "+toplam);

    }
}
