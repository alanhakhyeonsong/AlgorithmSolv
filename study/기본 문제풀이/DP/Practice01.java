// 1. 계단오르기
import java.io.*;

public class Practice01 {
    static int[] dp = new int[35];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp[1] = 1; dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-2]+dp[i-1];
        }

        System.out.println(dp[n]);
    }
}