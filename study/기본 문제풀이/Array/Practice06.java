// 6. 뒤집은 소수
import java.io.*;
import java.util.*;

public class Practice06 {
    static boolean[] isPrime = new boolean[100001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = st.nextToken();
        }
        System.out.println(solution(n, arr));
    }

    public static String solution(int n, String[] arr) {
        String answer = "";
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i < Math.sqrt(isPrime.length - 1); i++) {
            if (isPrime[i]) {
                int j = 2;
                while (i*j <= isPrime.length-1) {
                    isPrime[i*j] = false;
                    j++;
                }
            }
        }

        for (String s : arr) {
            String tmp = String.valueOf(new StringBuilder(s).reverse());
            if (isPrime[Integer.parseInt(tmp)]) {
                answer += String.valueOf(Integer.parseInt(tmp));
                answer += " ";
            }
        }
        return answer;
    }
}