// BOJ 9095번: 1,2,3 더하기
import java.io.*;

public class Main {
    static int[] dp = new int[11];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        dp[1] = 1; dp[2] = 2; dp[3] = 4;
        for (int i = 4; i <= 10; i++) {
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }

        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp[n]);
        }
    }
}