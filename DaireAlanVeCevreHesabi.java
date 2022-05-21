import java.util.Scanner;

public class DaireAlanVeCevreHesabi {
    public static void main(String[] args) {
        double yaricap;
        Scanner in = new Scanner(System.in);
        System.out.print("Yaricap degerini giriniz: ");
        yaricap = in.nextInt();

        double alan = Math.PI * Math.pow(yaricap,2);
        double cevre = 2 * Math.PI * yaricap;

        System.out.println("Alan: " + alan + " Cevre: " + cevre);
    }
}
