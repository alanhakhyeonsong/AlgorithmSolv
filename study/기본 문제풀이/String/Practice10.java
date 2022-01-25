// 10. 가장 짧은 문자거리
import java.io.*;
import java.util.*;

public class Practice10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] str = st.nextToken().toCharArray();
        char target = st.nextToken().charAt(0);

        int[] cnt = new int[str.length];
        int count = 1000;
        // 정방향 순회
        for (int i = 0; i < str.length; i++) {
            if (str[i] != target) {
                count++;
            } else {
                count = 0;
            }
            cnt[i] = count;
        }

        count = 1000;
        // 역방향 순회
        for (int i = str.length-1; i >= 0; i--) {
            if (str[i] != target) {
                count++;
                cnt[i] = Math.min(cnt[i], count);
            } else {
                count = 0;
            }
        }

        for (int i : cnt) {
            System.out.print(i + " ");
        }
    }
}