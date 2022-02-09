// BOJ 1182번: 부분수열의 합
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int n, s;
    static int count = 0;
    static int[] arr = new int[30];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        solution(0, 0);
        if (s == 0) count--;
        System.out.println(count);
    }

    public static void solution(int depth, int sum) {
        if (depth == n) {
            if (sum == s) count++;
            return;
        }
        solution(depth+1, sum); // 현재 것 선택 x
        solution(depth+1, sum+arr[depth]); // 현재 것 선택 o
    }
}