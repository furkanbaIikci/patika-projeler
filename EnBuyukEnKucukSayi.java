import java.util.Scanner;

public class EnBuyukEnKucukSayi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz: ");
        int sayiAdet = in.nextInt();
        int enKucuk, enBuyuk, girilenSayi;

        System.out.println("1. sayiyi giriniz:");
        girilenSayi = in.nextInt();
        enBuyuk = girilenSayi;
        enKucuk = girilenSayi;

        for (int i = 0; i < sayiAdet - 1; i++) {
            System.out.println(i + 2 + ". sayiyi giriniz: ");
            girilenSayi = in.nextInt();

            if (girilenSayi > enBuyuk) {
                enBuyuk = girilenSayi;
            } else if (girilenSayi < enKucuk) {
                enKucuk = girilenSayi;
            }

        }
        System.out.println("En buyuk sayi: " + enBuyuk + ". En kucuk sayi: " + enKucuk);
    }
}
