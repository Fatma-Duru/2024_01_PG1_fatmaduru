package chapter02;
import java.util.Scanner;
public class FeetToMetersConverter {
    public static void main(String[] args){

        // 2. Bölüm 3. Soru
        Scanner scanner= new Scanner(System.in);

        System.out.println("Lütfen Bir Feet değeri giriniz: ");
        double feet = scanner.nextDouble();
        scanner.close();

        double metre = feet * 0.305;
        System.out.println(feet + " Değerinin Metreye Çevirince "+ metre +" Değerini Alır.");


    }
}
