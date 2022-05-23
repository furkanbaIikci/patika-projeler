public class PalindromSayi {
    public static void main(String[] args) {
        palindromHesap(101);
        palindromHesap(450);
    }

    private static void palindromHesap(int sayi) {
        int temp = sayi, yeniSayi = 0, gecici;

        while (temp != 0) {
            gecici = temp % 10;
            yeniSayi = (yeniSayi * 10) + gecici;
            temp -= gecici;
            temp /= 10;
        }
        if (sayi == yeniSayi) {
            System.out.println("Sayi palindrom sayidir");
        } else {
            System.out.println("Sayi palindrom sayi degildir!");
        }
    }
}
