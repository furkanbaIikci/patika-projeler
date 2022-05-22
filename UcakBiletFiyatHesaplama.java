import java.util.Scanner;

public class UcakBiletFiyatHesaplama {
    public static void main(String[] args) {
        int mesafe;
        byte yas, yolculukTipi;
        double tutar, mesafeUcret = 0.10;

        Scanner in = new Scanner(System.in);

        System.out.println("Mesafe giriniz: ");
        while (true) {
            mesafe = in.nextInt();
            if (mesafe < 1) {
                System.err.println("Hatali deger girdiniz! Yeniden giriniz: ");
            } else {
                break;
            }
        }


        System.out.print("Yolcunun yasini giriniz: ");
        while (true) {
            yas = in.nextByte();
            if (yas < 0) {
                System.err.println("Hatali deger girdiniz! Yeniden giriniz: ");
            } else {
                break;
            }
        }

        System.out.println("Bilet tipini seciniz\n1-Tek yon\n2-Gidis Donus");
        while (true) {
            yolculukTipi = in.nextByte();
            if (yolculukTipi != 1 && yolculukTipi != 2) {
                System.err.println("Hatali deger girdiniz! Yeniden giriniz");
            } else
                break;
        }
        tutar = mesafeUcret * mesafe;

        if (yas < 12) {
            tutar = tutar / 2;
            System.out.println("Yas indiriminden faydalandiniz! Yeni tutar: " + tutar);
        } else if (yas > 12 && yas < 24) {
            tutar = tutar - (tutar / 10);
            System.out.println("Yas indiriminden faydalandiniz! Yeni tutar: " + tutar);
        } else if (yas > 65) {
            tutar = tutar - (tutar * 3 / 100);
            System.out.println("Yas indiriminden faydalandiniz! Yeni tutar: " + tutar);

        }

        if (yolculukTipi == 2) {
            tutar = 2 * (tutar - (tutar / 5));
            System.out.println("Gidis donus indiriminden yararlandiniz! Yeni tutar: " + tutar);
        }
        System.out.println("Odenecek tutar: " + tutar);

        in.close();
    }
}
