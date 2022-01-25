// 5. 동전교환(냅색 알고리즘)
import java.io.*;
import java.util.*;

public class Practice05 {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] coin = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            coin[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        dp = new int[m+1]; Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = coin[i]; j <= m; j++) {
                dp[j] = Math.min(dp[j], dp[j-coin[i]]+1);
            }
        }
        System.out.println(dp[m]);
    }
}