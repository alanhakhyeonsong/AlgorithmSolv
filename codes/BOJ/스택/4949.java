// BOJ 4949번: 균형잡힌 세상
import java.io.*;
import java.util.Stack;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = br.readLine();
            if (input.charAt(0) == '.') break;
            sb.append(solution(input)).append("\n");
        }
        System.out.println(sb);
    }

    static String solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[') stack.push(s.charAt(i));
            else if (s.charAt(i) == ')'){
                if (stack.isEmpty() || stack.peek() != '(') return "no";
                else stack.pop();
            } else if (s.charAt(i) == ']') {
                if (stack.isEmpty() || stack.peek() != '[') return "no";
                else stack.pop();
            }
        }
        if (stack.isEmpty()) return "yes";
        else return "no";
    }
}