// 6. 중복문자제거
import java.io.*;

public class Practice06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        boolean[] check = new boolean[26];
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (!check[c-'a']) {
                sb.append(c);
                check[c-'a'] = true;
            }
        }
        System.out.println(sb);
    }
}