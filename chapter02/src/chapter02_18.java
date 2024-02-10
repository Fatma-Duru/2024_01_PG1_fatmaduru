import java.util.Scanner;
public class chapter02_18 {
    public static void main(String[] args){
        //2.Bölüm 18. Soru
        /*a         b         pow(a, b)
          1         2         1
          2         3         8
          3         4         81
          4         5         1024
          5         6         15625*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Tablo için bir sınır değeri giriniz: ");
        int sinir = scanner.nextInt();
        System.out.println("a\tb\tpow(a,b)");
        for (int a = 1; a <= sinir; a++) {
            int b = a + 1;
            int pow = (int) Math.pow(a, b);
            System.out.println(a + "\t" + b + "\t" + pow);
        }

        scanner.close();

    }
}
