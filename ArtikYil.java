import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Yil giriniz: ");
        int yil = in.nextInt();

        if (yil % 4 == 0) {
            System.out.println("Artik yil");
        } else {
            System.out.println("Artik yil degil");
        }

        in.close();
    }
}
