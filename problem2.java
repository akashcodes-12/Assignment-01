import java.util.*;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int K = sc.nextInt();

        Arrays.sort(A);

        int median = A[N / 2];
        long operations = 0;

        for (int i = 0; i < N; i++) {
            int diff = Math.abs(A[i] - median);

            if (diff % K != 0) {
                System.out.println(-1);
                return;
            }

            operations += diff / K;
        }

        System.out.println(operations);
    }
}
