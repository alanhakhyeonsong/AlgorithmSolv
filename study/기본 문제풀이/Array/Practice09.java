// 9. 격자판 최대합
import java.io.*;
import java.util.StringTokenizer;

public class Practice09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int sum1, sum2;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            max = Math.max(max, sum1);
            max = Math.max(max, sum2);
        }

        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[j][j];
            }
            max = Math.max(max, sum1);
            for (int j = n-1; j >= 0; j--) {
                sum2 += arr[i][j];
            }
            max = Math.max(max, sum2);
        }

        System.out.println(max);
    }
}