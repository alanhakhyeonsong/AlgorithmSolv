// BOJ 1629번: 곱셈
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        System.out.println(solution(a, b, c));
    }

    public static long solution(long a, long b, long c) {
        if (b == 1) return a % c;
        long val =  solution(a, b/2, c);
        val = val * val % c;
        if (b % 2 == 0) return val;
        return val * a % c;
    }
}