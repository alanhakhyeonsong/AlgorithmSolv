// 1. 선택 정렬
import java.io.*;
import java.util.StringTokenizer;

public class Practice01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n-1; i++) {
            int index = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[index]) index = j;
            }
            int tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}