// BOJ 11053번: 가장 긴 증가하는 부분 수열
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] dp = new int[1001];
    static int[] arr = new int[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            dp[i] = 1;
            for (int j = i-1; j >= 0; j--) {
                if (arr[i] > arr[j] && dp[i] <= dp[j]) dp[i] = dp[j] + 1;
            }
        }
        int answer = 0;
        for (int i : dp) {
            answer = Math.max(answer, i);
        }
        System.out.println(answer);
    }
}