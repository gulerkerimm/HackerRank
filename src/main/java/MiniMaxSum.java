import java.util.Arrays;

public class MiniMaxSum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        miniMaxSum(arr);

    }

    private static void miniMaxSum(int[] arr) {

        // Diziyi küçükten büyüğe sıralıyoruz

        Arrays.sort(arr);

        // En küçük toplam, ilk dört elemanın toplamı
        long minSum = 0;
        for (int i = 0; i < 4; i++) {
            minSum += arr[i];

        }
        long maxSum = 0;
        for (int i = 1; i < 5; i++) {
            maxSum += arr[i];

        }
        System.out.println(minSum+" "+maxSum);



    }
}
