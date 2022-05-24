import java.util.Scanner;

public class DeseneGoreMetotOlusturma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Sayi giriniz: ");
        int sayi = in.nextInt();

        metot(sayi, 5, true, 0);

    }

    private static int metot(int sayi, int i, boolean b, int sayac) {
        System.out.println(sayi);
        if (sayi > 0 && b == true) {
            sayac++;
            sayi -= i;
            return metot(sayi, i, b, sayac);
        } else {
            b = false;
            sayi += i;
            sayac--;
            if (sayac >= 0) {
                return metot(sayi, i, b, sayac);
            } else
                return sayi;
        }

    }

}
