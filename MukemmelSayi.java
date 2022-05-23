import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Sayi giriniz: ");
        int sayi = in.nextInt();
        int bolenToplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                bolenToplam += i;
            }
        }

        if (bolenToplam == sayi) {
            System.out.println("Sayi mukemmel sayidir.");
        } else {
            System.out.println("Sayi mukemmel sayi degildir.");
        }
    }
}
