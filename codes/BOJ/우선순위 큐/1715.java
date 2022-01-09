// BOJ 1715번: 카드 정렬하기
import java.io.*;
import java.util.PriorityQueue;

public class Main {
    static PriorityQueue<Long> pq = new PriorityQueue<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long result = 0;
        while (n-- > 0) {
            pq.add(Long.parseLong(br.readLine()));
        }
        while (pq.size() > 1) {
            long a = pq.poll();
            long b = pq.poll();

            result += a + b;
            pq.add(a + b);
        }

        System.out.println(result);
    }
}