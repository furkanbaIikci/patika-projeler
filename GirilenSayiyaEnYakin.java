import java.util.Scanner;

public class GirilenSayiyaEnYakin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Sayi giriniz: ");
        int girilenSayi = in.nextInt();

        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        int kucuk = arr[0], buyuk = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > buyuk) {
                buyuk = arr[i];
            }
            if (arr[i] < kucuk) {
                kucuk = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > kucuk && girilenSayi > arr[i]) {
                kucuk = arr[i];
            } else if (arr[i] < buyuk && girilenSayi < arr[i]) {
                buyuk = arr[i];
            }
        }
        System.out.println("Kucuk: " + kucuk + " Buyuk: " + buyuk);
    }
}
