// BOJ 2579번: 계단 오르기
import java.io.*;

public class Main {
    static int[] dp;
    static int[] step;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new int[n+2];
        step = new int[n+2];
        for (int i = 1; i <= n; i++) {
            step[i] = Integer.parseInt(br.readLine());
        }
        dp[1] = step[1];
        if (n >= 2) {
            dp[2] = step[1] + step[2];
            for (int i = 3; i <= n; i++) {
                dp[i] = Math.max(dp[i-2] + step[i], dp[i-3] + step[i-1] + step[i]);
            }
        }

        System.out.println(dp[n]);
    }
}