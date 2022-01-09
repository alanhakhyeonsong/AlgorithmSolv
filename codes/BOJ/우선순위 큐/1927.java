// BOJ 1927번: 최소 힙
import java.io.*;
import java.util.*;

public class Main {
    static PriorityQueue<Long> pq = new PriorityQueue<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String input = br.readLine();
            if (input.equals("0")) {
                if (pq.size() == 0) System.out.println(0);
                else System.out.println(pq.poll());
            } else pq.add(Long.parseLong(input));
        }
    }
}