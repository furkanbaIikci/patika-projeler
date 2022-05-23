import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sayi1 = 0, sayi2 = 1, sonuc;
        int eleman = in.nextInt();

        while (eleman != 0) {
            sonuc = sayi1 + sayi2;
            System.out.println(sayi1);

            sayi1 = sayi2;
            sayi2 = sonuc;
            eleman--;

        }
    }
}
