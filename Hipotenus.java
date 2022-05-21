import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int kenar1,kenar2,kenar3;
        System.out.println("1. dik kenarı giriniz: ");
        kenar1 = in.nextInt();

        System.out.println("2. dik kenarı giriniz: ");
        kenar2 = in.nextInt();

        kenar3= (int) (Math.pow(kenar1,2) + Math.pow(kenar2,2));
        kenar3 = (int) Math.sqrt(kenar3);

        System.out.println("Hipotenüs: " + kenar3);
    }
}
