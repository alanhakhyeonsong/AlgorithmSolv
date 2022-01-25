// 7. 회문 문자열
import java.io.*;

public class Practice07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        // 방법 1
        //System.out.println(solution(input));

        // 방법 2
        String str = new StringBuilder(input).reverse().toString();
        if (!input.equalsIgnoreCase(str)) System.out.println("NO");
        else System.out.println("YES");
    }

    public static String solution(String s) {
        String result = "NO";
        char[] chars = s.toLowerCase().toCharArray();
        for (int i = 0; i <= chars.length/2; i++) {
            if (chars[i] != chars[chars.length-1-i]) {
                result = "NO";
                return result;
            }
            else result = "YES";
        }
        return result;
    }
}