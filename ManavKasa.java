import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armutFiyat = 2.14,elmaFiyat = 3.67,domatesFiyat =1.11,muzFiyat = 0.95,patlicanFiyat = 5.00;
        double armutKG,elmaKG,domatesKG,muzKG,patlicanKG;

        Scanner in = new Scanner(System.in);

        System.out.println("Kaç kilo armut aldiniz?");
        armutKG = in.nextByte();

        System.out.println("Kaç kilo elma aldiniz?");
        elmaKG = in.nextByte();

        System.out.println("Kaç kilo domates aldiniz?");
        domatesKG = in.nextByte();

        System.out.println("Kaç kilo muz aldiniz?");
        muzKG = in.nextByte();

        System.out.println("Kaç kilo patlican aldiniz?");
        patlicanKG = in.nextByte();

        double tutar = (armutFiyat*armutKG) + (elmaFiyat*elmaKG) +(domatesFiyat*domatesKG) +(muzFiyat*muzKG) + (patlicanFiyat *patlicanKG);
        System.out.println("Toplam tutar: " + tutar);
    }
}
