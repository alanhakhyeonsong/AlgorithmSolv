// 8. 유효한 팰린드롬
import java.io.*;

public class Practice08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toLowerCase().replaceAll("[^a-z]", "");
        if (input.equals(new StringBuilder(input).reverse().toString())) System.out.println("YES");
        else System.out.println("NO");
    }
}