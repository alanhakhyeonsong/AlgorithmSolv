// 2. 대소문자 변환
import java.io.*;

public class Practice02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        StringBuilder result = new StringBuilder();
        for (char c : input) {
            if (c >= 'a' && c <= 'z') result.append(String.valueOf(c).toUpperCase());
            else if (c >= 'A' && c <= 'Z') result.append(String.valueOf(c).toLowerCase());
        }

        System.out.println(result);
    }
}