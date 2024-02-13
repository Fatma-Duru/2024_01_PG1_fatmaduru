package chapter02;
import java.util.Scanner;
public class chapter02_13 {
    public static void main(String[] args){
        //2. Bölüm 13.Soru
        Scanner scanner= new Scanner(System.in);
        System.out.print("Aylık Biriktirdiğiniz Para Miktarını Lütfen Giriniz: ");
        double miktar= scanner.nextDouble();
        double aylikFaiz= 0.05/12;
        double hesapDegeri = 0 ;

        for (int i = 0; i < 6; i++) {
            hesapDegeri = (hesapDegeri + miktar) * (1 + aylikFaiz);
        }
        System.out.println("Altinci aydan sonra hesaptaki miktar "+hesapDegeri+" olacaktır.");
    }
}
