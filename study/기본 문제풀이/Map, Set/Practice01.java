// 1. 학급 회장
import java.io.*;
import java.util.HashMap;

public class Practice01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] chars = br.readLine().toCharArray();
        HashMap<Character, Integer> hs = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hs.put(chars[i], hs.getOrDefault(chars[i], 0) + 1);
        }

        int max = -1;
        char tmp = ' ';
        for (Character c : hs.keySet()) {
            if (hs.get(c) > max) {
                max = hs.get(c);
                tmp = c;
            }
        }
        System.out.println(tmp);
    }
}