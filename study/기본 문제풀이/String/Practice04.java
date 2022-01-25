// 4. 단어 뒤집기
import java.io.*;

public class Practice04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String result = new StringBuilder(br.readLine()).reverse().toString();
            System.out.println(result);
        }
    }
}