public class DizideTekrarEdenCiftSayi {
    public static void main(String[] args) {
        int[] dizi = {2, 2, 4, 4, 4, 4, 7, 5, 6, 4, 8, 8};
        int[] yeniDizi = new int[dizi.length];
        int startIndex = 0;


        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (i != j && dizi[i] == dizi[j] && dizi[i] % 2 == 0) {
                    yeniDizi[startIndex] = dizi[i];
                    startIndex++;
                    break;
                }
            }
        }

        for (int i = 0; i < yeniDizi.length; i++) {
            System.out.print(yeniDizi[i] + " ");
        }
    }
}
