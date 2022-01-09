// BOJ 2075번: N번째 큰 수
import java.io.*;
import java.util.*;

public class Main {
    static PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                pq.add(Integer.parseInt(st.nextToken()));
            }
        }
        for (int i = 0; i < n - 1; i++) {
            pq.remove();
        }
        System.out.println(pq.peek());
    }
}