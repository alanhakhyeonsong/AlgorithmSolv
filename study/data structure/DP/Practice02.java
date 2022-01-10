// 2. 돌다리 건너기
import java.io.*;

public class Practice02 {
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new int[n+2];
        dp[1] = 1; dp[2] = 2;
        for (int i = 3; i <= n+1; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }

        System.out.println(dp[n+1]);
    }
}