// 5. K번째 큰 수
import java.io.*;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Practice05 {
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

        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int l = j+1; l < n; l++) {
                    set.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }

        int count = 1; int result = -1;
        for (Integer x : set) {
            if (count == k) {
                result = x;
                break;
            }
            count++;
        }
        System.out.println(result);
    }
}