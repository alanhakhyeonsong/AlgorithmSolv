// BOJ 15655번: N과 M(6)
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
        solution(0);
        System.out.println(sb);
    }

    public static void solution(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(inputs[arr[i]]).append(" ");
            }
            sb.append("\n");
            return;
        }
        int start = 0;
        if (depth != 0) start = arr[depth-1];
        for (int i = start; i < n; i++) {
            if (!isUsed[i]) {
                arr[depth] = i;
                isUsed[i] = true;
                solution(depth+1);
                isUsed[i] = false;
            }
        }
    }
}