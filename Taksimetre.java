import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tutar = 10;
        System.out.println("Kaç km yol gidildi?");
        int km = in.nextInt();

        tutar += km*2.20;
        if(tutar<20){
            tutar = 20;
        }

        System.out.println("Toplam tutar: " + tutar);

    }
}
