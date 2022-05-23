import java.util.Scanner;

public class RecursiveUsHesabi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Taban deger giriniz: ");
        int taban = in.nextInt();

        System.out.println("Us degeri giriniz: ");
        int us = in.nextInt();

        System.out.println(usHesapla(taban, us));
    }

    private static int usHesapla(int taban, int us) {
        if (us == 1) {
            return taban;
        }

        return taban * usHesapla(taban, us - 1);
    }
}
