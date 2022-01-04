// 2. 보이는 학생
import java.io.*;
import java.util.*;

public class Practice02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int count = 1;
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                count++;
                max = arr[i];
            }
        }
        System.out.println(count);
    }
}