// BOJ 1992번: 쿼드트리
import java.io.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static int[][] grid;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                grid[i][j] = str.charAt(j) - '0';
            }
        }
        solution(0, 0, n);
        System.out.println(sb);
    }

    public static void solution(int x, int y, int size) {
        if (check(x, y, size)) {
            sb.append(grid[x][y]);
            return;
        }

        int newSize = size / 2;

        sb.append('(');

        solution(x, y, newSize);
        solution(x, y + newSize, newSize);
        solution(x + newSize, y, newSize);
        solution(x + newSize, y + newSize, newSize);

        sb.append(')');
    }

    public static boolean check(int x, int y, int size) {
        int value = grid[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (value != grid[i][j]) return false;
            }
        }
        return true;
    }
}