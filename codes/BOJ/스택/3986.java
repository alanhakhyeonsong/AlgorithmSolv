// BOJ 3986번: 좋은 단어
import java.io.*;
import java.util.Stack;

public class Main {
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String input = br.readLine();
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                if (!stack.isEmpty() && stack.peek() == input.charAt(i)) stack.pop();
                else stack.push(input.charAt(i));
            }
            if (stack.isEmpty()) count++;
        }
        System.out.println(count);
    }
}