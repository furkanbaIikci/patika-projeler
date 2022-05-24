import java.util.Scanner;

public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Dizi kac elemanli olsun?");
        int diziEleman = in.nextInt();
        int[] arr = new int[diziEleman];

        for (int i = 0; i < diziEleman; i++) {
            System.out.println(i + 1 + ". elemani giriniz: ");
            arr[i] = in.nextInt();
        }

        int min;

        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
