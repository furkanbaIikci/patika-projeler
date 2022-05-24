import java.util.Scanner;

public class DizidekiElemanlarinFrekansi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dizi kac elemanli olsun?");
        int diziEleman = in.nextInt();

        int[] dizi = new int[diziEleman];
        int counter;
        for (int i = 0; i < diziEleman; i++) {
            System.out.println(i + 1 + ". elemani giriniz: ");
            dizi[i] = in.nextInt();
        }

        for (int i = 0; i < diziEleman; i++) {
            counter = 0;
            for (int j = i; j < diziEleman; j++) {
                if (i != j && dizi[i] == dizi[j] && dizi[j] != 0) {
                    counter++;
                    dizi[j] = 0;
                }
            }
            if (counter != 0) {
                System.out.println(dizi[i] + " sayisi " + (counter + 1) + " kere tekrar etti.");
            }

        }
    }
}
