// 6. 최대점수 구하기(냅색알고리즘)
import java.io.*;
import java.util.StringTokenizer;

public class Practice06 {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        dp = new int[m+1];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int score = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            for (int j = m; j >= time; j--) {
                dp[j] = Math.max(dp[j], dp[j-time] + score);
            }
        }
        System.out.println(dp[m]);
    }
}