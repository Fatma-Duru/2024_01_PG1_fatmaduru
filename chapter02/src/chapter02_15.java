import java.util.Scanner;
import  java.lang.Math;
public class chapter02_15 {
    public static void main(String[] args){
        //2. Bölüm 15. Soru
        Scanner scanner= new Scanner(System.in);
        System.out.print("Lütfen x1 değerini giriniz: ");
        double x1 = scanner.nextDouble();
        System.out.print("Lütfen y1 değerini giriniz: ");
        double y1= scanner.nextDouble();
        System.out.print("Lütfen x2 değerini giriniz: ");
        double x2= scanner.nextDouble();
        System.out.print("Lütfen y2 değerini giriniz: ");
        double y2 = scanner.nextDouble();

        double mesafe= Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        System.out.print(" İki nokta arasindaki mesafe "+mesafe+" Şeklindedir.");

    }
}
