import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, dersSayisi = 0, toplam = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Matematik notunu giriniz: ");
        mat = in.nextInt();
        if (mat >= 0 && mat <= 100) {
            dersSayisi++;
            toplam += mat;
        }

        System.out.println("Fizik notunu giriniz: ");
        fizik = in.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            dersSayisi++;
            toplam += fizik;
        }

        System.out.println("Türkçe notunu giriniz:");
        turkce = in.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            dersSayisi++;
            toplam += turkce;
        }

        System.out.println("Kimya notunu giriniz: ");
        kimya = in.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            dersSayisi++;
            toplam += kimya;
        }

        System.out.println("Müzik notunu giriniz: ");
        muzik = in.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            dersSayisi++;
            toplam += muzik;
        }

        double ort = toplam / dersSayisi;
        if (ort >= 55) {
            System.out.println("Sınıfı geçtiniz! Ortalamanız: " + ort);
        } else {
            System.out.println("Sınıfta kaldınız! Ortalamanız: " + ort);
        }


    }
}
