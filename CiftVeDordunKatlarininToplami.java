import java.util.Scanner;

public class CiftVeDordunKatlarininToplami {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sayi,toplam=0;
        System.out.println("Girdiginiz sayi cift veya 4'un katı ise sayi toplanir. Girilen sayi tek ise program sonlanır. Sayi giriniz:");
        while (true){
            sayi = in.nextInt();

            if(sayi%2==0){
                toplam += sayi;
            }else{
                System.out.println("Program sonlandı. Sayilarin toplami: " + toplam);
                break;
            }
        }
    }
}
