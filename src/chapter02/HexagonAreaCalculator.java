package chapter02;
import java.util.Scanner;
public class HexagonAreaCalculator {
    public  static void main(String[] args){
        //2. Bölüm 16. Soru

        Scanner scanner= new Scanner(System.in);
        System.out.print("Lütfen altıgenin Kenar uzunlugunu yaziniz: ");
        double kenarUzunlugu= scanner.nextDouble();

        double alan= (3 * Math.sqrt(3) / 2) * Math.pow(kenarUzunlugu, 2);
        System.out.print("Altigenin alani  "+ alan);

    }
}
