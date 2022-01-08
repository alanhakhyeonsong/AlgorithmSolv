// BOJ 1074번: Z

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int size = (int) Math.pow(2, n);

        solution(size, r, c);

        System.out.println(count);
    }

    public static void solution(int size, int r, int c) {
        if (r == 0 && c == 0) {
            return;
        }
        int newSize = size / 2;
        if (r < newSize && c < newSize) {
            solution(newSize, r, c);
        } else if (r < newSize && c >= newSize) {
            count += size * size / 4;
            solution(newSize, r, c-newSize);
        } else if (r >= newSize && c < newSize) {
            count += (size * size / 4) * 2;
            solution(newSize, r-newSize, c);
        } else {
            count += (size * size / 4) * 3;
            solution(newSize, r-newSize, c-newSize);
        }
    }
}