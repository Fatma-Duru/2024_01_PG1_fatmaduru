package chapter03;
import java.util.Scanner;
public class LinearEquationSolver {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("a değerini giriniz: ");
        double a = input.nextDouble();

        System.out.print("b değerini giriniz: ");
        double b = input.nextDouble();

        System.out.print("c değerini giriniz: ");
        double c = input.nextDouble();

        System.out.print("d değerini giriniz: ");
        double d = input.nextDouble();

        System.out.print("e değerini giriniz: ");
        double e = input.nextDouble();

        System.out.print("f değerini giriniz: ");
        double f = input.nextDouble();


        if(a*d-b*c==0){
            System.out.println("Denklemin çözümü yoktur!");
        }else {
            double  x= (a*d-b*f)/(a*d-b*c);
            double y=(a*f-e*c)/(a*d-b*c);
            System.out.println("denklemin x ve y değerleri sırası ile "+x+ "ve "+y+ "şeklindedir.");
        }

    }

}
