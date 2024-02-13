package chapter02;
import  java.util.Scanner;
public class TipCalculator {
   public static void main(String[] args){
      // 2.Bölüm 5. Soru
      Scanner scanner= new Scanner(System.in);

      System.out.println("Lütfen Ara Toplam Değerini Giriniz: ");
      double  AraToplam = scanner.nextDouble();

      System.out.println("Lütfen Komisyon Oranını Giriniz: ");
      double KomisyonOrani= scanner.nextDouble();

      scanner.close();

      double KomisyonMiktari= AraToplam*(KomisyonOrani/100.0);

      double Toplam = AraToplam+KomisyonMiktari;

      System.out.println("Komisyon "+ KomisyonMiktari+" Toplam "+Toplam);




   }
}
