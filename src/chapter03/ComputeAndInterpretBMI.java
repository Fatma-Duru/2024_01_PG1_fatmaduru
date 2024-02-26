package chapter03;

import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ağırlığı pound cinsinden giriniz: ");
        double agirlikPound = input.nextDouble();

        System.out.print("Boyunu feet olarak giriniz: ");
        double feet = input.nextDouble();

        System.out.print("Boyunu inches olarak giriniz: ");
        double inches = input.nextDouble();

        final double KILOGRAM_PER_POUND = 0.45359237;
        final double METRE_PER_INCH = 0.0254;
        final double FEET_PER_INCH = 12;


        double agirlikKilogram = agirlikPound * KILOGRAM_PER_POUND;


        double boyMetreCinsinden = ((feet * FEET_PER_INCH) + inches) * METRE_PER_INCH;


        double vki = agirlikKilogram / (boyMetreCinsinden * boyMetreCinsinden);


        System.out.println("VKİ: " + vki);
        if (vki < 18.5) {
            System.out.println("Zayıf");
        } else if (vki < 25) {
            System.out.println("Normal");
        } else if (vki < 30) {
            System.out.println("Fazla kilolu");
        } else {
            System.out.println("Obez");
        }
    }
}
