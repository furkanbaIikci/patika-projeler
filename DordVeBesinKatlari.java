import java.util.Scanner;

public class DordVeBesinKatlari {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Sayi giriniz: ");
        int sayi = in.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (i % 4 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
