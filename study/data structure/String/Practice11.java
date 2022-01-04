// 11. 문자열 압축
import java.io.*;

public class Practice11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String result = "";
        StringBuilder sb = new StringBuilder();
        s = s + " ";
        int count = 1;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) count++;
            else {
                sb.append(s.charAt(i));
                if (count > 1) sb.append(count);
                count = 1;
            }
        }
        result = sb.toString();
        return result;
    }
}