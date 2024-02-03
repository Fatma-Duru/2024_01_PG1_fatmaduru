public class chapter01_12  {
    public static void main(String[] args) {
        //Soru 1.12
        double mesafeMil = 24.0;
        double sureSaat = 1.0;
        double sureDakika = 40.0;
        double sureSaniye = 35.0;
        double birMilKm = 1.6;
        double toplamSureSaniye = sureSaat * 3600 + sureDakika * 60 + sureSaniye;
        // Hızı hesapla
        double hizMilSaat = mesafeMil / toplamSureSaniye * 3600;
        double hizKmSaat = hizMilSaat * birMilKm;
        System.out.println("Ortalama Hız: " + hizKmSaat + " km/saat");

    }

}