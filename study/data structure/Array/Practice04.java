// 4. 피보나치 수열
import java.io.*;

public class Practice04 {
    static int[] arr = new int[46];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] answer = solution(n);
        for (int i = 0; i < n; i++) {
            System.out.print(answer[i] + " ");
        }
    }

    public static int[] solution(int n) {
        arr[0] = arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr;
    }
}