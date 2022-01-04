// 1. 큰 수 출력하기
import java.io.*;
import java.util.*;

public class Practice01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder(arr[0] + " ");
        for (int i = 1; i < n; i++) {
            if (arr[i-1] < arr[i]) {
                sb.append(arr[i]).append(" ");
            }
        }
        System.out.println(sb);
    }
}