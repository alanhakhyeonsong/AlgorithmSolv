// BOJ 15650번: N과 M(2)
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[] arr = new int[10];
    static boolean[] isUsed = new boolean[10];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        solution(0);
    }

    public static void solution(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        int start = 1; // 시작 지점, depth = 0 일때는 start = 1
        if (depth != 0) start = arr[depth-1] + 1; // depth != 0일 경우, start = arr[depth-1]+1
        for (int i = start; i <= n; i++) {
            if (!isUsed[i]) {
                arr[depth] = i;
                isUsed[i] = true;
                solution(depth+1);
                isUsed[i] = false;
            }
        }
    }
}