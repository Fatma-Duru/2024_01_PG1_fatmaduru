package chapter03;

import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        //3. Bölüm 1. Soru
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir a değeri giriniz: ");
        double a = scanner.nextDouble();
        System.out.print("Bir b değeri giriniz: ");
        double b = scanner.nextDouble();
        System.out.print("Bir c değeri giriniz: ");
        double c = scanner.nextDouble();

        double diskriminant = Math.pow(b, 2) - 4 * a * c;
        double kok1 = (-b + Math.sqrt(diskriminant)) / (2 * a);
        double kok2 = (-b - Math.sqrt(diskriminant)) / (2 * a);
        if (diskriminant > 0) {
            System.out.print("Denklemin iki gerçek kökü vardır: " + kok1 + " ve " + kok2);
        } else if (diskriminant == 0) {
            double kok = -b / (2 * a);
            System.out.print("Denklemin bir gerçek kökü vardır: " + kok);
        } else {
            System.out.print("Denklemin hiçbir gerçek kökü yoktur.");
        }
    }
}
