package chapter02;
import  java.util.Scanner;
public class TravelCostCalculator {
    public static void main(String[] args){
        //double maliyet = (mesafe / tuketim) * fiyat;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Seyahat mesafesini girin (km):");
        double mesafe= scanner.nextDouble();
        System.out.println("Aracın yakıt tüketimini girin (km/litre): ");
        double tuketim = scanner.nextDouble();
        System.out.print("Yakıt fiyatını girin (TL/litre): ");
        double fiyat = scanner.nextDouble();
       System.out.print("Seyahat maliyeti: "+(mesafe / tuketim) * fiyat);

    }
}
