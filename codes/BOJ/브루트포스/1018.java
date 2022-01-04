// BOJ 1018번: 체스판 다시 칠하기
import java.io.*;
import java.util.*;

public class Main {
    public static boolean[][] check;
    public static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        check = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                if (str.charAt(j) == 'W') check[i][j] = true;
                else check[i][j] = false;
            }
        }

        int row = n - 7;
        int col = m - 7;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                find(i, j);
            }
        }
        System.out.println(min);
    }

    public static void find(int x, int y) {
        int endX = x + 8;
        int endY = y + 8;
        int count = 0;

        boolean startPoint = check[x][y];

        for (int i = x; i < endX; i++) {
            for (int j = y; j < endY; j++) {
                if (check[i][j] != startPoint) {
                    count++;
                }
                startPoint = (!startPoint);
            }
            startPoint = (!startPoint);
        }
        count = Math.min(count, 64-count);
        min = Math.min(min, count);
    }
}