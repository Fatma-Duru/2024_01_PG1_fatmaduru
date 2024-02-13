package chapter01;

public class SeriesSum {
    public static void main(String[] args) {
        //Soru 1.6
        int toplam = 0;
        for (int i = 1; i <= 9; i++) {
            toplam += i;
        }
        System.out.println("Seri Toplamı: " + toplam);
    }
}