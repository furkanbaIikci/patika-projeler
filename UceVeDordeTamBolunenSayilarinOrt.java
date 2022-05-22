import java.util.Scanner;

public class UceVeDordeTamBolunenSayilarinOrt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Sayi giriniz: ");
        int sayi = in.nextInt();
        int sayac = 0, toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                sayac++;
                toplam += i;
                System.out.println(i + " " + sayac);

            }
        }
        double sonuc = toplam / sayac;
        System.out.println("Sonuc: " + sonuc);

    }
}
