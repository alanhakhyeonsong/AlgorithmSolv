// BOJ 15657번: N과 M(8)
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[] arr = new int[10];
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
        int st = 0;
        if (depth != 0) st = arr[depth-1];
        for (int i = st; i < n; i++) {
            arr[depth] = i;
            solution(depth+1);
        }
    }
}