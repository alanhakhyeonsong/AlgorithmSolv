// BOJ 2630번: 색종이 만들기

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static int w = 0;
    static int b = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        solution(arr, n, 0, 0);
        System.out.println(w);
        System.out.println(b);
    }

    public static void solution(int[][] arr, int size, int r, int c) {
        if (check(size, r, c)) {
            if (arr[r][c] == 1) b++;
            else w++;
            return;
        }

        int newSize = size / 2;
        solution(arr, newSize, r, c);
        solution(arr, newSize, r, c+newSize);
        solution(arr, newSize, r+newSize, c);
        solution(arr, newSize, r+newSize, c+newSize);
    }

    public static boolean check(int size, int r, int c) {
        int color = arr[r][c];
        boolean result = true;
        for (int i = r; i < r+size; i++) {
            for (int j = c; j < c+size; j++) {
                if (arr[i][j] != color) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}