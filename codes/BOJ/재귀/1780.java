// BOJ 1780번: 종이의 개수

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static int t1 = 0;
    static int t2 = 0;
    static int t3 = 0;

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
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }

    public static void solution(int[][] arr, int size, int r, int c) {
        if (check(size, r, c)) {
            if (arr[r][c] == -1) t1++;
            else if (arr[r][c] == 0) t2++;
            else t3++;
            return;
        }

        int newSize = size / 3;
        solution(arr, newSize, r, c);
        solution(arr, newSize, r, c+newSize);
        solution(arr, newSize, r, c+newSize*2);

        solution(arr, newSize, r+newSize, c);
        solution(arr, newSize, r+newSize, c+newSize);
        solution(arr, newSize, r+newSize, c+newSize*2);

        solution(arr, newSize, r+newSize*2, c);
        solution(arr, newSize, r+newSize*2, c+newSize);
        solution(arr, newSize, r+newSize*2, c+newSize*2);
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