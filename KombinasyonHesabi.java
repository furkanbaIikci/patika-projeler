import java.util.Scanner;

public class KombinasyonHesabi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("C(n,r)\nn sayisini giriniz: ");
        int n = in.nextInt();
        System.out.println("r sayisini giriniz: ");
        int r = in.nextInt();


        int kombinasyon = faktoriyel(n) / (faktoriyel(r) * (faktoriyel(n - r)));
        System.out.println("Kombinasyon degeri: " + kombinasyon);
    }

    private static void fak() {
    }

    public static int faktoriyel(int sayi) {
        int toplam = sayi;
        for (int i = sayi - 1; i > 0; i--) {
            toplam *= i;
        }
        return toplam;
    }
}
