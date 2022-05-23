import java.util.Scanner;

public class HarmonikSayilar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Sayi giriniz: ");
        int sayi = in.nextInt();

        double toplam = 0;

        for (int i = 1; i <= sayi; i++) {
            toplam += (double) 1 / i;
        }
        System.out.println("Harmonik Seri: " + toplam);
    }
}
