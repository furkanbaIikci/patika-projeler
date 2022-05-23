public class AsalSayi {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i == 2) {
                System.out.print(i + " ");
            }
            for (int j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    break;
                } else if (j == 2) {
                    System.out.print(i + " ");
                }

            }
        }
    }
}
