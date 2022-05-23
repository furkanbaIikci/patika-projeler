import java.util.Scanner;

public class YildizlarlaElmas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ucgen kac satirdan olussun?");
        int n = in.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = n; i >= 0; i--) {
            for (int j = (n - i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i + 1); k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}
