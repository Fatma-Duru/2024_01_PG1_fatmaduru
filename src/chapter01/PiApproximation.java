package chapter01;

public class PiApproximation {
    public static void main(String[] args) {

        // Pi terim sayısı olan ? Soru 1.7

        double sonucBolum1 = 4 * (1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11);
        double sonucBolum2 = 4 * (1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13);

        System.out.println("4 *(1-(1/3)+(1/5)-(1/7)+(1/9)-(1/11)) için Sonuç: " + sonucBolum1);
        System.out.println("4 *(1-(1/3)+(1/5)-(1/7)+(1/9)-(1/11)+(1/13)) için Sonuç: " + sonucBolum2);

    }
}