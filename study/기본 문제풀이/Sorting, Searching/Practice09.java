// 9. 뮤직비디오(결정 알고리즘)
import java.io.*;
import java.util.*;

public class Practice09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(n, m, arr));
    }

    public static int count(int[] arr, int capacity) {
        int count = 1, sum = 0;
        for (int x : arr) {
            if (sum + x > capacity) {
                count++;
                sum = x;
            }
            else sum += x;
        }
        return count;
    }

    public static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) <= m) {
                answer = mid;
                rt = mid -1;
            }
            else lt = mid + 1;
        }
        return answer;
    }
}