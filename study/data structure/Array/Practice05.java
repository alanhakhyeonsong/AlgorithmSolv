// 5. 소수(에라토스테네스 체)
import java.io.*;
import java.util.Arrays;

public class Practice05 {
    public static boolean[] isPrime = new boolean[200001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        Arrays.fill(isPrime, true);
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isPrime[i]) {
                int j = 2;
                while (i * j <= n) {
                    isPrime[i*j] = false;
                    j += 1;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) count++;
        }
        System.out.println(count);
    }
}