// 6. 장난꾸러기
import java.io.*;
import java.util.*;

public class Practice06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n]; int[] tmp;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        tmp = arr.clone();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (arr[i] != tmp[i]) {
                sb.append(i+1).append(" ");
            }
        }
        System.out.println(sb);
    }
}