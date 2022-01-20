// 8. 등수구하기
import java.io.*;
import java.util.StringTokenizer;

public class Practice08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] score = new int[n];
        int[] answer = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 0; j < n; j++) {
                if (score[j] > score[i]) {
                    count++;
                }
            }
            answer[i] = count;
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}