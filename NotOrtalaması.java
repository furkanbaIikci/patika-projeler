import java.util.Scanner;

public class NotOrtalaması {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner in = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz: ");
        mat = in.nextInt();
        System.out.print("Fizik notunu giriniz: ");
        fizik = in.nextInt();
        System.out.print("Kimya notunu giriniz: ");
        kimya = in.nextInt();
        System.out.print("Turkce notunu giriniz: ");
        turkce = in.nextInt();
        System.out.print("Tarih notunu giriniz: ");
        tarih = in.nextInt();
        System.out.print("Müzik notunu giriniz: ");
        muzik = in.nextInt();

    int ort = (mat + fizik + kimya + turkce + tarih + muzik)/6;
        System.out.println(ort);
        System.out.println(ort>=60 ? "Sınıfı Geçti": "Sınıfta Kaldı");

    }
}
