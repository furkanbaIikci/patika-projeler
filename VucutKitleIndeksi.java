import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Boyunuzu m cinsinden giriniz: ");
        double boy = in.nextDouble();

        System.out.println("Kilonuzu giriniz: ");
        double kilo = in.nextDouble();

        double indeks = kilo / (Math.pow(boy,2));
        System.out.println(indeks);
    }
}
