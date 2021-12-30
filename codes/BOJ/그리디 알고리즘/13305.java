// BOJ 13305번: 주유소
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] dist = new long[n-1];
        long[] cost = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n-1; i++) {
            dist[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cost[i] = Long.parseLong(st.nextToken());
        }
        long sum = 0;
        long tmp = cost[0];
        for (int i = 0; i < n-1; i++) {
            if (tmp > cost[i]) tmp = cost[i];
            sum += (tmp * dist[i]);
        }

        System.out.println(sum);
    }
}