import java.util.Scanner;

public class UsHesaplama {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hangi sayinin üssünü hesaplamak istiyorsunuz?");
        int sayi = in.nextInt();

        System.out.println("Üs degeri giriniz: ");
        int us = in.nextInt();

        int toplam = 1;
        for (int i = us; i > 0; i--) {
            toplam *= sayi;
        }
        System.out.println("Sonuc: " + toplam);

    }
}
