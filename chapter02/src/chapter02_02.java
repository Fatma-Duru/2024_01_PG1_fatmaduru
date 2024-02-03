import  java.util.Scanner;
import  java.lang.Math;
public class chapter02_02 {
    public static void main(String[] args){

       //2. Bölüm 2. Soru
       Scanner scanner= new Scanner(System.in);

       System.out.println("Lütfen Bir Yarıçap Değeri Giriniz: ");
       double yaricap= scanner.nextDouble();

       System.out.println("Lütfen Bir Yükseklik Değeri Giriniz:  ");
       double yukseklik= scanner.nextDouble();

       scanner.close();

        double alan= yaricap * yaricap *Math.PI;
        double hacim= alan*yukseklik;

        System.out.println("Girilen Değerin alanı: "+alan);
        System.out.println("Girdiğiniz Degerin Hacmi "+ hacim);
    }
}
