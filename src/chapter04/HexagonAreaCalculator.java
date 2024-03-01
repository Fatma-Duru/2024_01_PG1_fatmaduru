package chapter04;
import java.util.Scanner;
public class HexagonAreaCalculator {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


        System.out.print("Kenar uzunluğunu giriniz: ");
    double sideLength = scanner.nextDouble();


        scanner.close();


    double area = (3 * Math.sqrt(3) * Math.pow(sideLength, 2)) / 2;


        System.out.printf("Altigenin alani %.2f'dir.%n", area);
}}
