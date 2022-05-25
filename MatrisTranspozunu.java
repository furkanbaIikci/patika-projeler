import java.util.Scanner;

public class MatrisTranspozunu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz: ");
        int satir = in.nextInt();

        System.out.println("Sutun sayisini giriniz: ");
        int sutun = in.nextInt();

        int[][] arr = new int[satir][sutun];
        int[][] arrTra = new int[sutun][satir];

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.println(i + 1 + ". satirin " + (j + 1) + " . sutun degerini giriniz: ");
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                arrTra[j][i] = degerDondur(arr, i, j);
            }
        }


        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                System.out.print(arrTra[i][j] + "   ");
            }
            System.out.println();
        }

    }

    public static int degerDondur(int[][] arr, int satir, int sutun) {
        return arr[satir][sutun];
    }
}
