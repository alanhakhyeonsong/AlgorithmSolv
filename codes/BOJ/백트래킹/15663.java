// BOJ 15663번: N과 M(9)
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
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        int tmp = 0; // 중복 수열인지 확인 용도
        for (int i = 0; i < n; i++) {
            if (!isUsed[i] && tmp != inputs[i]) { // 이전 수열의 마지막 항과 새로운 수열의 마지막 항이 같으면 중복 수열
                isUsed[i] = true;
                arr[depth] = inputs[i];
                tmp = arr[depth];
                solution(depth+1);
                isUsed[i] = false;
            }
        }
    }
}