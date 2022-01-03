// 12. 암호
import java.io.*;

public class Practice12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        System.out.println(solution(n, input));
    }

    public static String solution(int n, String s) {
        String result = "";
        for (int i = 0; i < n; i++) {
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            result += (char) num;
            s = s.substring(7);
        }

        return result;
    }
}