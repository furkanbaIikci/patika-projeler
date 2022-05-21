import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        int sicaklik;
        Scanner in = new Scanner(System.in);

        System.out.println("Sicaklik degeri giriniz: ");
        sicaklik = in.nextInt();

        if(sicaklik<=5){
            System.out.println("Kayak yapabilirsin!");
        }else if(sicaklik>5 && sicaklik<=15){
            System.out.println("Sinemaya gidebilisin!");
        }else if(sicaklik>15 && sicaklik<=25){
            System.out.println("Piknik yapabilirsin!");
        }else if(sicaklik>25){
            System.out.println("Yüzmeye gidebilirsin");
        }
    }
}
