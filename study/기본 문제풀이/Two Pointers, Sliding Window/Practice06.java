// 6. 최대 길이 연속부분수열
import java.io.*;
import java.util.StringTokenizer;

public class Practice06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0, count = 0, lt = 0;
        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) count++;
            while (count > k) {
                if (arr[lt] == 0) count--;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }
        System.out.println(answer);
    }
}