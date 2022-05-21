import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Hangi islemi yapacaksiniz?\n1-Toplama \n2-Cikarma \n3-Carpma\n4-Bolme");
        byte secim = in.nextByte();
        int sayi1,sayi2,sonuc=0;
        System.out.print("1. sayiyi giriniz: ");
        sayi1 = in.nextInt();
        System.out.print("2. sayiyi giriniz: ");
        sayi2 = in.nextInt();


        switch (secim){
            case 1:
                sonuc = sayi1 + sayi2;
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                break;
            case 4:
                sonuc = sayi1 / sayi2;
                break;
            default:
                System.out.println("Hatali secim yaptiniz!");
                break;
        }
        System.out.println("Yaptiginiz islemin sonucu: " + sonuc);
        in.close();


    }


}
