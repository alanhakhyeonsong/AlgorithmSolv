// 3. 매출액의 종류
import java.io.*;
import java.util.*;

public class Practice03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hs = new HashMap<>();

        for (int i = 0; i < k-1; i++) {
            hs.put(arr[i], hs.getOrDefault(arr[i], 0)+1);
        }
        int lt = 0;
        for (int rt = k-1; rt < n; rt++) {
            hs.put(arr[rt], hs.getOrDefault(arr[rt], 0)+1);
            list.add(hs.size());
            hs.put(arr[lt], hs.get(arr[lt])-1);
            if (hs.get(arr[lt]) == 0) hs.remove(arr[lt]);
            lt++;
        }
        for (Integer x : list) {
            System.out.print(x + " ");
        }
    }
}