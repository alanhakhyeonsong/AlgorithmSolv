// 4. Least Recently Used
import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Practice04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] cache = new int[s];
        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < s; i++) if (x == cache[i]) pos = i;
            if (pos == -1) {
                for (int i = s-1; i >= 1; i--) {
                    cache[i] = cache[i-1];
                }
            } else {
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;
        }

        for (int i : cache) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int s, int n, int[] arr) {
        LinkedList<Integer> cache = new LinkedList<>();
        int[] answer = new int[s];

        for (int i : arr) {
            if (cache.contains(i)) { // 캐시에 최근 작업이 이미 있다면
                cache.remove(i);
            }
            cache.addFirst(i);

            if (cache.size() > s) {
                cache.removeLast();
            }
        }

        for (int i = 0; i < s; i++) {
            answer[i] = cache.get(i);
        }

        return answer;
    }
}