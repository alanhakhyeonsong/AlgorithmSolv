// 5. 중복 확인
import java.io.*;
import java.util.*;

public class Practice05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        String answer = "U";
        for (int i = 0; i < n-1; i++) {
            if (arr[i] == arr[i+1]) answer = "D";
        }
        System.out.println(answer);
    }
}