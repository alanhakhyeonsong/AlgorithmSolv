// BOJ 18870번: 좌표 압축
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        int[] tmp = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            tmp[i] = Integer.parseInt(st.nextToken());
        }
        int[] inputs = tmp.clone();
        Arrays.sort(tmp);

        for (int i = 1; i < n; i++) {
            if (tmp[i-1] != tmp[i])
                list.add(tmp[i-1]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(solution(list, inputs[i])).append(" ");
        }

        System.out.println(sb);
    }

    public static int solution(ArrayList<Integer> list, int target) {
        int lt = 0, rt = list.size();
        while (lt < rt) {
            int mid = (lt + rt) / 2;

            if (target <= list.get(mid)) {
                rt = mid;
            } else {
                lt = mid + 1;
            }
        }
        return lt;
    }
}