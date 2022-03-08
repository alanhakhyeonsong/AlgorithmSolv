// BOJ 2447번: 별 찍기 - 10
import java.io.*;
import java.util.Arrays;

public class Main {
    static char[][] board = new char[2300][2300];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], ' ');
        }

        solution(n, 0, 0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(board[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static void solution(int n, int x, int y) {
        if (n == 1) {
            board[x][y] = '*';
            return;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1)
                    continue;
                solution(n/3, x+n/3*i, y+n/3*j);
            }
        }
    }
}