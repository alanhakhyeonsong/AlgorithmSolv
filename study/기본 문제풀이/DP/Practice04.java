// 4. 가장 높은 탑 쌓기(LIS 응용)
import java.io.*;
import java.util.*;

public class Practice04 {
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new int[n];
        ArrayList<Brick> list = new ArrayList<>();
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            list.add(new Brick(s, h, w));
        }
        Collections.sort(list);
        dp[0] = list.get(0).h;
        int result = dp[0];
        for (int i = 1; i < list.size(); i++) {
            int max_h = 0;
            for (int j = i-1; j >= 0; j--) {
                if (list.get(j).w > list.get(i).w && dp[j] > max_h) {
                    max_h = dp[j];
                }
            }
            dp[i] = max_h + list.get(i).h;
            result = Math.max(result, dp[i]);
        }

        System.out.println(result);
    }

    static class Brick implements Comparable<Brick> {
        public int s, h, w;

        public Brick(int s, int h, int w) {
            this.s = s;
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Brick o) {
            return o.s - this.s;
        }
    }
}