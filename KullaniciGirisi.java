import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password;
        Scanner in = new Scanner(System.in);

        System.out.println("Kullanici adini giriniz: ");
        userName = in.next();

        System.out.println("Şifrenizi giriniz: ");
        password = in.next();

        if (userName.equals("furkan") && password.equals("patikadev")) {
            System.out.println("Basarili bir sekilde giris yaptiniz! ");
        } else {
            System.err.println("Kullanici adi veya sifre yanlis. Sifirlamak ister misiniz?\n1-Evet\n2-Hayir ");
            byte secim = in.nextByte();
            if (secim == 1) {
                System.out.println("Kullanici adini giriniz");
                userName = in.next();
                if (userName.equals("furkan")) {
                    System.out.println("Yeni sifrenizi giriniz: ");
                    String newPassword = in.next();
                    if (newPassword.equals("patikadev")) {
                        System.err.println("Yeni sifre eski sifreyle ayni olamaz!");
                    } else {
                        System.out.println("Sifreniz basarili bir sekilde guncellendi!");
                    }

                } else {
                    System.err.println("Kullanici adini yanlis girdiniz!");
                }
            }
        }


    }
}
