// BOJ 1094번: 막대기
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i <= 6; i++) {
            if ((x & (1<<i)) != 0) count++;
        }
        System.out.println(count);
    }
}