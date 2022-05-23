import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Deger giriniz: ");
        int deger = in.nextInt();


        for (int i = 0; i <=deger ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <(deger - i)*2+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
