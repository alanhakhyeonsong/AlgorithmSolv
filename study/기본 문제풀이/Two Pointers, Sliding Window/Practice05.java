// 5. 연속된 자연수의 합
import java.io.*;

public class Practice05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n/2+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }

        int count = 0, sum = 0, lt = 0;
        for (int rt = 0; rt < arr.length; rt++) {
            sum += arr[rt];
            if (sum == n) count++;
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) count++;
            }
        }

        System.out.println(count);
    }

    // 수학으로 푸는 방식
    public static int solution(int n) {
        int answer = 0, count = 1;
        n--;
        while (n > 0) {
            count++;
            n = n-count;
            if (n % count == 0) answer++;
        }
        return answer;
    }
}