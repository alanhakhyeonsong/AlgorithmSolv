// 3. 최대 매출
import java.io.*;
import java.util.StringTokenizer;

public class Practice03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int lt = 0;
        int sum, tmp = 0;
        for (int i = 0; i < m; i++) {
            tmp += arr[i];
        }
        sum = tmp;
        for (int rt = m; rt < n; rt++) {
            tmp += (arr[rt] - arr[lt++]);
            sum = Math.max(sum, tmp);
        }
        System.out.println(sum);
    }
}