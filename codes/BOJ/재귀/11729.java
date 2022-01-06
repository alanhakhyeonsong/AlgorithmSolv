// BOJ 11729번: 하노이 탑 이동순서
import java.io.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        sb.append((int) Math.pow(2, n) - 1).append("\n");
        solution(n, 1, 2, 3);
        System.out.println(sb);
    }

    public static void solution(int n, int start, int mid, int end) {
        if (n == 1) {
            sb.append(start).append(" ").append(end).append("\n");
            return;
        }
        solution(n-1, start, end, mid);
        sb.append(start).append(" ").append(end).append("\n");
        solution(n-1, mid, start, end);
    }
}