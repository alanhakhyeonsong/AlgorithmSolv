// 3. 최대 부분 증가수열
import java.io.*;
import java.util.StringTokenizer;

public class Practice03 {
    static int[] dp;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n]; dp = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = 1; int result = 0;

        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = i-1; j >= 0; j--) {
                if (arr[i] > arr[j] && dp[j] > max) max = dp[j];
            }
            dp[i] = max + 1;
            result = Math.max(result, dp[i]);
        }

        System.out.println(result);
    }
}