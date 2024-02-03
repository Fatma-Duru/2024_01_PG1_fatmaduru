public class chapter01_13 {
    public static void main(String[] args) {

        //Soru 1.13 istersen java.util.Scanner kütüphanesini kullanarak verileri kullanıcıdan da ala bilirsin
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;
        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);

        System.out.println("Çözüm:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }

}
