import java.util.Scanner;

public class chapter02_01 {
    public static void main(String[] args) {
        //2. Bölüm 1. Soru
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Santigrat değerini giriniz: ");
        double Santigrat = scanner.nextDouble();
        scanner.close();

        double Fahrenhayt = (9.0 / 5) * Santigrat + 32;
        System.out.println(Santigrat + " Santigrat " + Fahrenhayt + " Fahrenhayt'tir.");
    }
}
