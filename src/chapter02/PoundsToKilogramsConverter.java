package chapter02;
import java.util.Scanner;

public class PoundsToKilogramsConverter {
    public static void main(String[] args){

        // 2. Bölüm 4. Soru
        Scanner scanner= new Scanner(System.in);

        System.out.println("Lütfen Bir Poundu  değeri giriniz: ");
        double Poundu  = scanner.nextDouble();
        scanner.close();

        double Kilograma  = Poundu  * 0.454 ;
        System.out.println(Poundu  + " Değerinin Kilograma Çevirince "+ Kilograma +" Değerini Alır.");

    }
}
