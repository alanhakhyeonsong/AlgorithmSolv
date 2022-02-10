// BOJ 15664번: N과 M(10)
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[] arr = new int[10];
    static boolean[] isUsed = new boolean[10];
    static int[] inputs;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        inputs = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            inputs[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(inputs);
        solution(0, 0);
        System.out.println(sb);
    }

    public static void solution(int depth, int st) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        int tmp = 0;
        for (int i = st; i < n; i++) {
            if (!isUsed[i] && tmp != inputs[i]) {
                arr[depth] = inputs[i];
                tmp = arr[depth];
                solution(depth+1, i+1);
            }
        }
    }
}