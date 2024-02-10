import java.util.Scanner;
public class chapter02_20 {
    public static void main(String[] args){
        //2.Bölüm 20. Soru
        Scanner scanner= new Scanner(System.in);
        System.out.print("Bakiyeyi Giriniz: ");
        double bakiye= scanner.nextDouble();

        System.out.print("Yıllık faiz oranını giriniz: ");
        double yillikaizOrani =scanner.nextDouble();

        double faizGetirisi= bakiye*(yillikaizOrani/1200);
        System.out.print("Faiz: "+faizGetirisi);

    }
}
