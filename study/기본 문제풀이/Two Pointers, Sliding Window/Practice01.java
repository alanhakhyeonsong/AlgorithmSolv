// 1. 두 배열 합치기
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Practice01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        int[] b = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        ArrayList<Integer> list = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (a[p1] > b[p2]) list.add(b[p2++]);
            else list.add(a[p1++]);
        }
        while (p1 < n) list.add(a[p1++]);
        while (p2 < m) list.add(b[p2++]);
        for (Integer x : list) {
            System.out.print(x + " ");
        }
    }
}