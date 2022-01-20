// 7. 점수계산
import java.io.*;
import java.util.StringTokenizer;

public class Practice07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0, count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                sum += count;
            } else count = 0;
        }
        System.out.println(sum);
    }
}