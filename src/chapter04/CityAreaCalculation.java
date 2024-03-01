package chapter04;

public class CityAreaCalculation {
    public static void main(String[] args) {
        // Şehirlerin koordinatları derece cinsinden (enlem, boylam)
        double[][] cities = {
                {33.7490, -84.3880},   // Atlanta, Georgia
                {28.5383, -81.3792},   // Orlando, Florida
                {32.0809, -81.0912},   // Savannah, Georgia
                {35.2271, -80.8431}    // Charlotte, North Carolina
        };

        // Şehirler arası mesafeleri hesapla ve toplam alanı bul
        double totalArea = calculateTotalArea(cities);

        // Toplam alanı ekrana yazdır
        System.out.println("Şehirler tarafından kapsanan tahmini alan: " + totalArea + " birim kare");
    }

    // Şehirler arasındaki mesafeleri hesaplayıp toplam alanı bulan metod
    public static double calculateTotalArea(double[][] cities) {
        double totalArea = 0;

        // Şehirler arasındaki mesafeleri hesapla
        for (int i = 0; i < cities.length; i++) {
            for (int j = i + 1; j < cities.length; j++) {
                double distance = calculateDistance(cities[i][0], cities[i][1], cities[j][0], cities[j][1]);
                totalArea += distance;
            }
        }

        return totalArea;
    }

    // İki nokta arasındaki mesafeyi Haversine formülü ile hesaplayan metod
    public static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        double earthRadius = 6371; // Dünya yarıçapı kilometre cinsinden

        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
                        Math.sin(dLon / 2) * Math.sin(dLon / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = earthRadius * c;

        return distance;
    }
}
