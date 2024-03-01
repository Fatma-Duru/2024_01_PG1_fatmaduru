package chapter04;
import java.util.Scanner;
public class PentagonAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Besgenin merkezinden kosesine kadar olan uzunlugu giriniz: ");
        double r = scanner.nextDouble();

        double s = 2*r*Math.sin(Math.PI/5);
        double area= (5*Math.pow(s,2))/(4*Math.tan(Math.PI/5));

        System.out.print("Beşgenin alanı "+area+" 'dır.");


    }
}
