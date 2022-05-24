public class DizidekiElemanlarinHarmonikOrtalamasi {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double harmonikToplam = 0;
        double harmonikHesap = 0;

        for (int i = 0; i < numbers.length; i++) {

            harmonikToplam += (double) 1 / numbers[i];

        }

        System.out.println("Harmonik Ortalama: " + (numbers.length / harmonikToplam));
    }
}
