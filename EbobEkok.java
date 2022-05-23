import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ebob Ekok hesaplanacak ilk sayiyi giriniz: ");
        int sayi1 = in.nextInt();
        System.out.println("Ebob Ekok hesaplanacak ikinci sayiyi giriniz: ");
        int sayi2 = in.nextInt();

        int temp = 1;
        System.out.print("En büyük ortak bölenler: ");
        while (true) {
            if (sayi1 % temp == 0 && sayi2 % temp == 0) {
                System.out.print(temp + " ");
            }
            if (temp > sayi1 || temp > sayi2) {
                break;
            }
            temp++;
        }
        temp = 1;
        System.out.println();
        System.out.print("En küçük ortak katlar: ");
        while (true) {
            if (sayi1 % temp == 0 && sayi2 % temp == 0) {
                System.err.print((sayi1 * sayi2) / temp + " ");

            }
            if (temp > sayi1 || temp > sayi2) {
                break;
            }
            temp++;
        }


    }
}
