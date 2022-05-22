import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        int sayi1, sayi2, sayi3;
        Scanner in = new Scanner(System.in);
        System.out.println("1. sayiyi giriniz: ");
        sayi1 = in.nextInt();

        System.out.println("2. sayiyi giriniz: ");
        sayi2 = in.nextInt();

        System.out.println("3. sayiyi giriniz: ");
        sayi3 = in.nextInt();

        if (sayi1 > sayi2 && sayi1 > sayi3) {
            if (sayi2 > sayi3) {
                System.out.println("Buyukten kucuge siralama: " + sayi1 + " " + sayi2 + " " + sayi3);
            } else {
                System.out.println("Buyukten kucuge siralama: " + sayi1 + " " + sayi3 + " " + sayi2);
            }
        } else if (sayi2 > sayi1 && sayi2 > sayi3) {
            if (sayi1 > sayi3) {
                System.out.println("Buyukten kucuge siralama: " + sayi2 + " " + sayi1 + " " + sayi3);
            } else {
                System.out.println("Buyukten kucuge siralama: " + sayi2 + " " + sayi3 + " " + sayi1);
            }
        } else {
            if (sayi1 > sayi2) {
                System.out.println("Buyukten kucuge siralama: " + sayi3 + " " + sayi1 + " " + sayi2);
            } else {
                System.out.println("Buyukten kucuge siralama: " + sayi3 + " " + sayi2 + " " + sayi1);
            }
        }


        in.close();
    }
}
