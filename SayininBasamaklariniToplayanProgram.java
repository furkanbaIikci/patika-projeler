import java.util.Scanner;

public class SayininBasamaklariniToplayanProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Sayi giriniz: ");
        int sayi = in.nextInt();
        int basamakToplam = 0, basamak;
        while (sayi != 0) {
            basamak = sayi % 10;
            sayi -= basamak;
            basamakToplam += basamak;
            sayi = sayi / 10;
        }
        System.out.println("Basamaklarinin toplami: " + basamakToplam);
    }
}
