// BOJ 10816번: 숫자 카드 2
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] target = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            target[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i : target) {
            sb.append(upperBound(arr, i)-lowerBound(arr, i)).append(" ");
        }
        System.out.println(sb);
    }

    public static int upperBound(int[] arr, int target) {
        int lt = 0, rt = arr.length;
        while (lt < rt) {
            int mid = (lt + rt) / 2;

            if (target < arr[mid]) {
                rt = mid;
            } else {
                lt = mid + 1;
            }
        }
        return lt;
    }

    public static int lowerBound(int[] arr, int target) {
        int lt = 0, rt = arr.length;
        while (lt < rt) {
            int mid = (lt + rt) / 2;

            if (target <= arr[mid]) {
                rt = mid;
            } else {
                lt = mid + 1;
            }
        }
        return lt;
    }
}