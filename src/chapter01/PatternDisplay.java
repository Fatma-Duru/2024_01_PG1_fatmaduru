package chapter01;
import java.util.Scanner;

public class PatternDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("J, A, V, A HARFLERİNDEN BİRİNİ GİRİNİZ: ");
        char harf = scanner.next().charAt(0);

        switch (harf) {
            case 'J':
            case 'j':
                System.out.println("    J   ");
                System.out.println("    J  ");
                System.out.println(" J  J ");
                System.out.println("  J J ");
                break;
            case 'A':
            case 'a':
                System.out.println("    A    ");
                System.out.println("   A A   ");
                System.out.println("  AAAAA  ");
                System.out.println(" A     A ");
                break;
            case 'V':
            case 'v':
                System.out.println("V     V ");
                System.out.println(" V   V  ");
                System.out.println("  V V   ");
                break;
            default:
                System.out.println("TANIMLI OLMAYAN HARFLERDEN GİRİŞ YAPILDI TÜM HARFLER ŞU DESENDEDİR.");
                System.out.println("    J     A     V     V    A");
                System.out.println("    J    A A     V   V    A A");
                System.out.println(" J  J   AAAAA     V V    AAAAA");
                System.out.println("  J J  A     A     V    A     A");
        }

        scanner.close();
    }
}
