import java.util.Scanner;

public class KDVHesap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int tutar = in.nextInt();

    if(tutar>=1000){
        tutar = tutar + (tutar*8/100);
        System.out.println("Yeni tutar: " + tutar);

    }else{
        tutar = tutar + (tutar*18/100);
        System.out.println("Yeni tutar: " + tutar);

    }

    }
}
