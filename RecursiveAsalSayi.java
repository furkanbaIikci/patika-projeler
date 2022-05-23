import java.util.Scanner;

public class RecursiveAsalSayi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Sayi giriniz: ");
        int sayi = in.nextInt();
        int sayac = 2;

        boolean sonuc = asal(sayi, sayac);
        if (sonuc) {
            System.out.println("Girilen sayi asal sayidir.");
        } else {
            System.out.println("Girilen sayi asal sayi degildir!");
        }
    }

    private static boolean asal(int sayi, int sayac) {
        if (sayi <= 2) {
            if (sayi == 2) {
                return true;
            } else {
                return false;
            }
        }
        if (sayi % sayac == 0) {
            return false;
        }
        if (sayac * sayac > sayi) {
            return true;
        }
        return asal(sayi, sayac + 1);
    }
}
